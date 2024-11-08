package fr.djinn.kashir.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.level.block.entity.FurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class DemoniumFurnaceBlockEntity extends FurnaceBlockEntity {
    private int localLitTime;
    private int localLitDuration;
    private int localCookingProgress;
    private int localCookingTotalTime;

    private final ContainerData furnaceData = new ContainerData() {
        @Override
        public int get(int index) {
            switch (index) {
                case 0: return getLitTime();
                case 1: return getLitDuration();
                case 2: return getCookingProgress();
                case 3: return getCookingTotalTime();
                default: return 0;
            }
        }

        @Override
        public void set(int index, int value) {
            switch (index) {
                case 0: setLitTime(value); break;
                case 1: setLitDuration(value); break;
                case 2: setCookingProgress(value); break;
                case 3: setCookingTotalTime(value); break;
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
    };

    public DemoniumFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    // Getters et setters pour les valeurs
    public int getLitTime() {
        return localLitTime;
    }

    public void setLitTime(int time) {
        this.localLitTime = time;
    }

    public int getLitDuration() {
        return localLitDuration;
    }

    public void setLitDuration(int duration) {
        this.localLitDuration = duration;
    }

    public int getCookingProgress() {
        return localCookingProgress;
    }

    public void setCookingProgress(int progress) {
        this.localCookingProgress = progress;
    }

    public int getCookingTotalTime() {
        return localCookingTotalTime;
    }

    public void setCookingTotalTime(int totalTime) {
        this.localCookingTotalTime = totalTime;
    }

    public ContainerData getFurnaceData() {
        return furnaceData;
    }
}
