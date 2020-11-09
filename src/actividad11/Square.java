/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11;

/**
 *
 * @author melissa.a.lopez
 */
public class Square implements Shape {

    @Override
    public float getArea(float length, float width) {
        return (length * width);

    }

    @Override
    public float getPerimeter(float length, float width) {
        return ((length * 2) + (width * 2));

    }

}
