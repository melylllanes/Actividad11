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
public class Triangle implements Shape {

    @Override
    public float getArea(float base, float height) {
        return (base * height) / 2;

    }

    @Override
    public float getPerimeter(float base, float height) {
        return ((2*height)+ base);
    }

}
