/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.datarat.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author nauglrj1
 */
@Entity
public class CSVSinkElement extends SinkElement {
    
    private final List<Element> inputs = new ArrayList<Element>();
    
}
