package com.hwpo_training_app.affiliated_gym.data.entity;

import defpackage.cq4;
import defpackage.f93;
import defpackage.hl3;
import defpackage.rd9;
import defpackage.sk0;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class GymFilterCountryNetworkEntity implements f93<cq4> {
    public static final Companion Companion = new Companion();
    public final String t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<GymFilterCountryNetworkEntity> serializer() {
            return GymFilterCountryNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GymFilterCountryNetworkEntity(int i, String str) {
        if (1 == (i & 1)) {
            this.t = str;
        } else {
            hl3.b(i, 1, GymFilterCountryNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    @Override // defpackage.f93
    public final cq4 a() {
        return new cq4(this.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GymFilterCountryNetworkEntity) && xj5.a(this.t, ((GymFilterCountryNetworkEntity) obj).t);
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    public final String toString() {
        return sk0.c("GymFilterCountryNetworkEntity(country=", this.t, ")");
    }
}
