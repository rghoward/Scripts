package com.hwpo_training_app.core.data.model.schedule;

import defpackage.av;
import defpackage.cq5;
import defpackage.f93;
import defpackage.hl3;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.vb0;
import defpackage.xj5;
import j$.time.LocalDate;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class LaunchDateNetworkEntity implements f93<cq5> {
    public static final Companion Companion = new Companion();
    public final String t;
    public final String u;
    public final String v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<LaunchDateNetworkEntity> serializer() {
            return LaunchDateNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LaunchDateNetworkEntity(String str, String str2, String str3, int i) {
        if (3 != (i & 3)) {
            hl3.b(i, 3, LaunchDateNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = str;
        this.u = str2;
        if ((i & 4) == 0) {
            this.v = null;
        } else {
            this.v = str3;
        }
    }

    @Override // defpackage.f93
    public final cq5 a() {
        LocalDate localDate = LocalDate.parse(this.u);
        localDate.getClass();
        return new cq5(this.t, localDate, this.v);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LaunchDateNetworkEntity)) {
            return false;
        }
        LaunchDateNetworkEntity launchDateNetworkEntity = (LaunchDateNetworkEntity) obj;
        return xj5.a(this.t, launchDateNetworkEntity.t) && xj5.a(this.u, launchDateNetworkEntity.u) && xj5.a(this.v, launchDateNetworkEntity.v);
    }

    public final int hashCode() {
        int iC = ru3.c(this.t.hashCode() * 31, 31, this.u);
        String str = this.v;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return av.a(vb0.a("LaunchDateNetworkEntity(title=", this.t, ", date=", this.u, ", cover="), this.v, ")");
    }
}
