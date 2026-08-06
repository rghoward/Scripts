package com.hwpo_training_app.leaderboards.filter.details.presentation.screen.entity;

import defpackage.av;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AgeRangeStateUiEntity {
    public final boolean a;
    public final String b;
    public final String c;

    public AgeRangeStateUiEntity(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgeRangeStateUiEntity)) {
            return false;
        }
        AgeRangeStateUiEntity ageRangeStateUiEntity = (AgeRangeStateUiEntity) obj;
        return this.a == ageRangeStateUiEntity.a && xj5.a(this.b, ageRangeStateUiEntity.b) && xj5.a(this.c, ageRangeStateUiEntity.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AgeRangeStateUiEntity(isAgeRangeLayoutExpanded=");
        sb.append(this.a);
        sb.append(", minAge=");
        sb.append(this.b);
        sb.append(", maxAge=");
        return av.a(sb, this.c, ")");
    }
}
