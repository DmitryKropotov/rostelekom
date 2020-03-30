/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.List;
import model.Color;
import service.ColorService;

/**
 *
 * @author mitya
 */
public class ColorRepositoryImpl implements ColorRepository {
    
    private ColorService colorService;

    @Override
    public List<Color> findAllColors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
