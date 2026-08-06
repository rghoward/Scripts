package com.hwpo_training_app.core.data.model.schedule;

import defpackage.c08;
import defpackage.f93;
import defpackage.fz;
import defpackage.hl3;
import defpackage.il;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class PlanOptionNetworkEntity implements f93<c08> {
    public static final Companion Companion = new Companion();
    public final int t;
    public final String u;
    public final boolean v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<PlanOptionNetworkEntity> serializer() {
            return PlanOptionNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlanOptionNetworkEntity(int i, int i2, String str, boolean z) {
        if (7 != (i & 7)) {
            hl3.b(i, 7, PlanOptionNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = str;
        this.v = z;
    }

    @Override // defpackage.f93
    public final c08 a() {
        return new c08(this.t, this.u, this.v);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanOptionNetworkEntity)) {
            return false;
        }
        PlanOptionNetworkEntity planOptionNetworkEntity = (PlanOptionNetworkEntity) obj;
        return this.t == planOptionNetworkEntity.t && xj5.a(this.u, planOptionNetworkEntity.u) && this.v == planOptionNetworkEntity.v;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.v) + ru3.c(Integer.hashCode(this.t) * 31, 31, this.u);
    }

    public final String toString() {
        return fz.c(il.a("PlanOptionNetworkEntity(id=", ", title=", this.u, ", isDefault=", this.t), this.v, ")");
    }
}
