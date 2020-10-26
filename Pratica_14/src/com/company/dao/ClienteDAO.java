package com.company.dao;

import com.company.model.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import java.sql.*;
import java.util.ArrayList;

public class ClienteDAO implements DAO<Cliente>, DAOFields {
    private Connection connection;
    private final String myDBConnectionString = "jdbc:sqlite:dados_tuned.db";
    public ClienteDAO() {
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @Override
    public List<Cliente> get(String condition) {
        List<Cliente> clientes = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectConditionalString(getTableName()) + condition);
            while(result.next()){
                Cliente cliente = new Cliente(
                        result.getString("id"),
                        result.getString("name"),
                        result.getString("email")
                );
                clientes.add(cliente);
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clientes;
    }

    @Override
    public List<Cliente> getALL() {
        List<Cliente> clientes = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectAllString(getTableName()));
            while(result.next()){
                Cliente cliente = new Cliente(
                        result.getString("id"),
                        result.getString("name"),
                        result.getString("email")
                );
                clientes.add(cliente);
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clientes;
    }

    @Override
    public void update(Cliente cliente) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getUpdateString(getTableName()));
            preparedStatement.setString(1, cliente.getId());
            preparedStatement.setString(2, cliente.getName());
            preparedStatement.setString(3, cliente.getEmail());
            preparedStatement.setString(4, cliente.getId());
            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void delete(Cliente cliente) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getDeleteString(getTableName()));
            preparedStatement.setString(1, cliente.getId());
            preparedStatement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void create(Cliente cliente) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
            preparedStatement.setString(1, cliente.getId());
            preparedStatement.setString(2, cliente.getName());
            preparedStatement.setString(3, cliente.getEmail());
            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public String getTableName() {
        return "clientes";
    }
    @Override
    public String getDeleteString(String table) {
        return "DELETE FROM "+ table +" WHERE id = ?";
    }
    @Override
    public String getUpdateString(String table) {
        return "UPDATE "+ table +" SET id = ?, name = ?, email = ? WHERE id = ?;";
    }
    @Override
    public String getInsertString(String table) {
        return "INSERT INTO "+ table + " (id, name, email) VALUES (?, ?, ?);";
    }
    @Override
    public String getSelectAllString(String table) {
        return "SELECT * FROM " + table;
    }
    @Override
    public String getSelectConditionalString(String table) {
        return "SELECT * FROM " + table + " WHERE ";
    }
}
