package com.hwpo_training_app.leaderboards.list.common.presentation.entity;

import defpackage.e4;
import defpackage.fk;
import defpackage.il;
import defpackage.os2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.ux1;
import defpackage.xj5;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TopValueUiEntity {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final ArrayList k;

    public TopValueUiEntity(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, boolean z, boolean z2, ArrayList arrayList) {
        fk.b(str, str3, str5);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = str5;
        this.h = str6;
        this.i = z;
        this.j = z2;
        this.k = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopValueUiEntity)) {
            return false;
        }
        TopValueUiEntity topValueUiEntity = (TopValueUiEntity) obj;
        return this.a == topValueUiEntity.a && xj5.a(this.b, topValueUiEntity.b) && xj5.a(this.c, topValueUiEntity.c) && xj5.a(this.d, topValueUiEntity.d) && this.e.equals(topValueUiEntity.e) && this.f == topValueUiEntity.f && xj5.a(this.g, topValueUiEntity.g) && xj5.a(this.h, topValueUiEntity.h) && this.i == topValueUiEntity.i && this.j == topValueUiEntity.j && this.k.equals(topValueUiEntity.k);
    }

    public final int hashCode() {
        int iC = ru3.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iC2 = ru3.c(os2.a(this.f, ru3.c(ru3.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31), 31, this.g);
        String str2 = this.h;
        return this.k.hashCode() + uo2.a(uo2.a((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31, this.i, 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("TopValueUiEntity(id=", ", athleteName=", this.b, ", avatarUrl=", this.a);
        ux1.b(sbA, this.c, ", authorAvatarLetter=", this.d, ", position=");
        sbA.append(this.e);
        sbA.append(", positionBadgeColorRes=");
        sbA.append(this.f);
        sbA.append(", countryYearsText=");
        ux1.b(sbA, this.g, ", resultText=", this.h, ", isMine=");
        e4.a(sbA, this.i, ", isMultipleScores=", this.j, ", simpleAdditionalResults=");
        sbA.append(this.k);
        sbA.append(")");
        return sbA.toString();
    }
}
