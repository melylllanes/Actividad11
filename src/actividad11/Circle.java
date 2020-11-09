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
public class Circle implements Shape {

    @Override
    public float getArea(float radius, float PI) {

        return (float) (Math.pow(radius, 2) * PI);
    }

    @Override
    public float getPerimeter(float radius, float PI) {
        return (2 * PI * radius);
    }

}