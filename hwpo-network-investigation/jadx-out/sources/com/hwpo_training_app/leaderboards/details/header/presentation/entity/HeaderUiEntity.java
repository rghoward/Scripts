package com.hwpo_training_app.leaderboards.details.header.presentation.entity;

import defpackage.ru3;
import defpackage.uo2;
import defpackage.vb0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HeaderUiEntity {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public HeaderUiEntity(String str, String str2, CharSequence charSequence, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderUiEntity)) {
            return false;
        }
        HeaderUiEntity headerUiEntity = (HeaderUiEntity) obj;
        return this.a.equals(headerUiEntity.a) && this.b.equals(headerUiEntity.b) && xj5.a(this.c, headerUiEntity.c) && this.d == headerUiEntity.d && this.e == headerUiEntity.e && this.f == headerUiEntity.f;
    }

    public final int hashCode() {
        int iC = ru3.c(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        return Boolean.hashCode(this.f) + uo2.a(uo2.a((iC + (charSequence == null ? 0 : charSequence.hashCode())) * 31, this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbA = vb0.a("HeaderUiEntity(title=", this.a, ", lastUpdatedText=", this.b, ", description=");
        sbA.append((Object) this.c);
        sbA.append(", isHeaderVisible=");
        sbA.append(this.d);
        sbA.append(", showOnlyTrackingButton=");
        sbA.append(this.e);
        sbA.append(", isTrackingButtonVisible=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
