package com.hwpo_training_app.leaderboards.details.header.presentation.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ExpandableDescriptionStatesUiEntity {
    public static final ExpandableDescriptionStatesUiEntity t;
    public static final ExpandableDescriptionStatesUiEntity u;
    public static final ExpandableDescriptionStatesUiEntity v;
    public static final ExpandableDescriptionStatesUiEntity w;
    public static final ExpandableDescriptionStatesUiEntity x;
    public static final /* synthetic */ ExpandableDescriptionStatesUiEntity[] y;

    static {
        ExpandableDescriptionStatesUiEntity expandableDescriptionStatesUiEntity = new ExpandableDescriptionStatesUiEntity("INVISIBLE", 0);
        t = expandableDescriptionStatesUiEntity;
        ExpandableDescriptionStatesUiEntity expandableDescriptionStatesUiEntity2 = new ExpandableDescriptionStatesUiEntity("EXPANDED", 1);
        u = expandableDescriptionStatesUiEntity2;
        ExpandableDescriptionStatesUiEntity expandableDescriptionStatesUiEntity3 = new ExpandableDescriptionStatesUiEntity("EXPANDED_ALWAYS", 2);
        v = expandableDescriptionStatesUiEntity3;
        ExpandableDescriptionStatesUiEntity expandableDescriptionStatesUiEntity4 = new ExpandableDescriptionStatesUiEntity("COLLAPSED_INITIAL", 3);
        w = expandableDescriptionStatesUiEntity4;
        ExpandableDescriptionStatesUiEntity expandableDescriptionStatesUiEntity5 = new ExpandableDescriptionStatesUiEntity("COLLAPSED", 4);
        x = expandableDescriptionStatesUiEntity5;
        y = new ExpandableDescriptionStatesUiEntity[]{expandableDescriptionStatesUiEntity, expandableDescriptionStatesUiEntity2, expandableDescriptionStatesUiEntity3, expandableDescriptionStatesUiEntity4, expandableDescriptionStatesUiEntity5};
    }

    public ExpandableDescriptionStatesUiEntity() {
        throw null;
    }

    public static ExpandableDescriptionStatesUiEntity valueOf(String str) {
        return (ExpandableDescriptionStatesUiEntity) Enum.valueOf(ExpandableDescriptionStatesUiEntity.class, str);
    }

    public static ExpandableDescriptionStatesUiEntity[] values() {
        return (ExpandableDescriptionStatesUiEntity[]) y.clone();
    }
}
