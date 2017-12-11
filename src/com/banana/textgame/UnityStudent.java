package com.banana.textgame;

public class UnityStudent extends GameDevStudent implements IUnityMaster {

    @Override
    public String[] getSkills() {
        return new String[]{"Unity", "C#"};
    }

    @Override
    public int getUnitySkillLevel() {
        return 32;
    }

}
