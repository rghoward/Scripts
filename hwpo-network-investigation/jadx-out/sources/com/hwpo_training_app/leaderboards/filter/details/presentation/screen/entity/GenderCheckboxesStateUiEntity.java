package com.hwpo_training_app.leaderboards.filter.details.presentation.screen.entity;

import defpackage.fz;
import defpackage.uo2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class GenderCheckboxesStateUiEntity {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public GenderCheckboxesStateUiEntity(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenderCheckboxesStateUiEntity)) {
            return false;
        }
        GenderCheckboxesStateUiEntity genderCheckboxesStateUiEntity = (GenderCheckboxesStateUiEntity) obj;
        return this.a == genderCheckboxesStateUiEntity.a && this.b == genderCheckboxesStateUiEntity.b && this.c == genderCheckboxesStateUiEntity.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + uo2.a(Boolean.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenderCheckboxesStateUiEntity(isMaleGenderChecked=");
        sb.append(this.a);
        sb.append(", isFemaleGenderChecked=");
        sb.append(this.b);
        sb.append(", isOtherGenderChecked=");
        return fz.c(sb, this.c, ")");
    }
}
