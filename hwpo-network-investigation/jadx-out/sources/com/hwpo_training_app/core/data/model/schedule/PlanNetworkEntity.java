package com.hwpo_training_app.core.data.model.schedule;

import defpackage.a08;
import defpackage.b08;
import defpackage.f93;
import defpackage.g93;
import defpackage.hf3;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.l66;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ss5;
import defpackage.xj5;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class PlanNetworkEntity implements f93<a08> {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] y;
    public final Integer t;
    public final String u;
    public final PlanType v;
    public final String w;
    public final List<PlanOptionNetworkEntity> x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<PlanNetworkEntity> serializer() {
            return PlanNetworkEntity$$serializer.INSTANCE;
        }
    }

    static {
        l66 l66Var = new l66(2);
        j26 j26Var = j26.t;
        y = new ss5[]{null, null, hv5.c(j26Var, l66Var), null, hv5.c(j26Var, new b08(0))};
    }

    public /* synthetic */ PlanNetworkEntity(int i, Integer num, String str, PlanType planType, String str2, List list) {
        if (6 != (i & 6)) {
            hl3.b(i, 6, PlanNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.t = null;
        } else {
            this.t = num;
        }
        this.u = str;
        this.v = planType;
        if ((i & 8) == 0) {
            this.w = null;
        } else {
            this.w = str2;
        }
        if ((i & 16) == 0) {
            this.x = null;
        } else {
            this.x = list;
        }
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a08 a() {
        a08.a aVarA = this.v.a();
        List<PlanOptionNetworkEntity> list = this.x;
        return new a08(this.t, this.u, aVarA, this.w, list != null ? g93.a(list) : hf3.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanNetworkEntity)) {
            return false;
        }
        PlanNetworkEntity planNetworkEntity = (PlanNetworkEntity) obj;
        return xj5.a(this.t, planNetworkEntity.t) && xj5.a(this.u, planNetworkEntity.u) && this.v == planNetworkEntity.v && xj5.a(this.w, planNetworkEntity.w) && xj5.a(this.x, planNetworkEntity.x);
    }

    public final int hashCode() {
        Integer num = this.t;
        int iHashCode = (this.v.hashCode() + ru3.c((num == null ? 0 : num.hashCode()) * 31, 31, this.u)) * 31;
        String str = this.w;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<PlanOptionNetworkEntity> list = this.x;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PlanNetworkEntity(id=" + this.t + ", title=" + this.u + ", planType=" + this.v + ", cover=" + this.w + ", planOptions=" + this.x + ")";
    }
}
