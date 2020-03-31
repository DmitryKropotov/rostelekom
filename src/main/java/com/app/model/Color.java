/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author mitya
 */
@Data
@AllArgsConstructor
public class Color {
    int id;
    String colorNumber;
    String name;
}
