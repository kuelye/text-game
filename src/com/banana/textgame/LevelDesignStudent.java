package com.banana.textgame;

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

}
