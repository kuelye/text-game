package com.banana.textgame;

import java.util.Arrays;

public class LevelDesignStudent extends GameDevStudent implements IUnityMaster, IDesignStudent {

    @Override
    public String[] getSkills() {
        return new String[]{"Unity", "3D Max", "Blender"};
    }

    public int getUnitySkillLevel() {
        return 27;
    }

    public boolean knowPhotoshop() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " Уроверь владения Unity: " + getUnitySkillLevel() + ".";
    }

}
