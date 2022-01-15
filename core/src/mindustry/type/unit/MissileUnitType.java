package mindustry.type.unit;

import mindustry.ai.types.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.world.meta.*;

/** Field template for unit types. No new functionality. */
public class MissileUnitType extends UnitType{

    public MissileUnitType(String name){
        super(name);

        playerControllable = false;
        createWreck = false;
        logicControllable = false;
        isCounted = false;
        useUnitCap = false;
        allowedInPayloads = false;
        defaultController = MissileAI::new;
        flying = true;
        constructor = TimedKillUnit::create;
        envEnabled = Env.any;
        envDisabled = Env.none;
        physics = false;
        trailLength = 7;
        hidden = true;
        speed = 4f;
        lifetime = 60f * 3f;
        rotateSpeed = 3f;
        range = 30f;
        //TODO weapons, etc
    }
}
