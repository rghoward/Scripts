package com.hwpo_training_app.core.data.model.gym;

import defpackage.av;
import defpackage.f93;
import defpackage.hl3;
import defpackage.il;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ux1;
import defpackage.xj5;
import defpackage.yp4;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class GymNetworkEntity implements f93<yp4> {
    public static final Companion Companion = new Companion();
    public final int t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<GymNetworkEntity> serializer() {
            return GymNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GymNetworkEntity(String str, String str2, String str3, String str4, int i, int i2) {
        if (15 != (i & 15)) {
            hl3.b(i, 15, GymNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = str;
        this.v = str2;
        this.w = str3;
        if ((i & 16) == 0) {
            this.x = null;
        } else {
            this.x = str4;
        }
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final yp4.a a() {
        return new yp4.a(this.u, this.v, this.w, this.x, this.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GymNetworkEntity)) {
            return false;
        }
        GymNetworkEntity gymNetworkEntity = (GymNetworkEntity) obj;
        return this.t == gymNetworkEntity.t && xj5.a(this.u, gymNetworkEntity.u) && xj5.a(this.v, gymNetworkEntity.v) && xj5.a(this.w, gymNetworkEntity.w) && xj5.a(this.x, gymNetworkEntity.x);
    }

    public final int hashCode() {
        int iC = ru3.c(ru3.c(ru3.c(Integer.hashCode(this.t) * 31, 31, this.u), 31, this.v), 31, this.w);
        String str = this.x;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = il.a("GymNetworkEntity(id=", ", name=", this.u, ", country=", this.t);
        ux1.b(sbA, this.v, ", city=", this.w, ", state=");
        return av.a(sbA, this.x, ")");
    }
}
