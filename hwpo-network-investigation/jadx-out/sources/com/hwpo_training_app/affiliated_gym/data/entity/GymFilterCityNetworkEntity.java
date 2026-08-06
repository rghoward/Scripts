package com.hwpo_training_app.affiliated_gym.data.entity;

import defpackage.aq4;
import defpackage.av;
import defpackage.f93;
import defpackage.hl3;
import defpackage.il;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class GymFilterCityNetworkEntity implements f93<aq4> {
    public static final Companion Companion = new Companion();
    public final int t;
    public final String u;
    public final String v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<GymFilterCityNetworkEntity> serializer() {
            return GymFilterCityNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GymFilterCityNetworkEntity(int i, int i2, String str, String str2) {
        if (3 != (i & 3)) {
            hl3.b(i, 3, GymFilterCityNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = str;
        if ((i & 4) == 0) {
            this.v = null;
        } else {
            this.v = str2;
        }
    }

    @Override // defpackage.f93
    public final aq4 a() {
        return new aq4(this.t, this.u, this.v);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GymFilterCityNetworkEntity)) {
            return false;
        }
        GymFilterCityNetworkEntity gymFilterCityNetworkEntity = (GymFilterCityNetworkEntity) obj;
        return this.t == gymFilterCityNetworkEntity.t && xj5.a(this.u, gymFilterCityNetworkEntity.u) && xj5.a(this.v, gymFilterCityNetworkEntity.v);
    }

    public final int hashCode() {
        int iC = ru3.c(Integer.hashCode(this.t) * 31, 31, this.u);
        String str = this.v;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return av.a(il.a("GymFilterCityNetworkEntity(id=", ", city=", this.u, ", state=", this.t), this.v, ")");
    }
}
