package com.hwpo_training_app.core.data.model.schedule.score;

import defpackage.f93;
import defpackage.g93;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.w59;
import defpackage.xj5;
import defpackage.y59;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class ScoreValueNetworkEntity implements f93<w59> {
    public final Boolean A;
    public final Boolean B;
    public final int t;
    public final Integer u;
    public final Integer v;
    public final Double w;
    public final Boolean x;
    public final Integer y;
    public final List<ScoreSubValueNetworkEntity> z;
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] C = {null, null, null, null, null, null, hv5.c(j26.t, new y59()), null, null};

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<ScoreValueNetworkEntity> serializer() {
            return ScoreValueNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ScoreValueNetworkEntity(int i, int i2, Integer num, Integer num2, Double d, Boolean bool, Integer num3, List list, Boolean bool2, Boolean bool3) {
        if (7 != (i & 7)) {
            hl3.b(i, 7, ScoreValueNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = num;
        this.v = num2;
        if ((i & 8) == 0) {
            this.w = null;
        } else {
            this.w = d;
        }
        if ((i & 16) == 0) {
            this.x = null;
        } else {
            this.x = bool;
        }
        if ((i & 32) == 0) {
            this.y = null;
        } else {
            this.y = num3;
        }
        if ((i & 64) == 0) {
            this.z = null;
        } else {
            this.z = list;
        }
        if ((i & 128) == 0) {
            this.A = Boolean.FALSE;
        } else {
            this.A = bool2;
        }
        if ((i & 256) == 0) {
            this.B = Boolean.FALSE;
        } else {
            this.B = bool3;
        }
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final w59 a() {
        Integer num = this.u;
        int iIntValue = num != null ? num.intValue() : -1;
        Integer num2 = this.v;
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        Double d = this.w;
        double dDoubleValue = d != null ? d.doubleValue() : -1.0d;
        Boolean bool = this.x;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Integer num3 = this.y;
        int iIntValue3 = num3 != null ? num3.intValue() : -1;
        List listA = g93.a(this.z);
        Boolean bool2 = this.A;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = this.B;
        return new w59(this.t, iIntValue, iIntValue2, dDoubleValue, zBooleanValue, iIntValue3, listA, zBooleanValue2, bool3 != null ? bool3.booleanValue() : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScoreValueNetworkEntity)) {
            return false;
        }
        ScoreValueNetworkEntity scoreValueNetworkEntity = (ScoreValueNetworkEntity) obj;
        return this.t == scoreValueNetworkEntity.t && xj5.a(this.u, scoreValueNetworkEntity.u) && xj5.a(this.v, scoreValueNetworkEntity.v) && xj5.a(this.w, scoreValueNetworkEntity.w) && xj5.a(this.x, scoreValueNetworkEntity.x) && xj5.a(this.y, scoreValueNetworkEntity.y) && xj5.a(this.z, scoreValueNetworkEntity.z) && xj5.a(this.A, scoreValueNetworkEntity.A) && xj5.a(this.B, scoreValueNetworkEntity.B);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.t) * 31;
        Integer num = this.u;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.v;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.w;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.x;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.y;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<ScoreSubValueNetworkEntity> list = this.z;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.A;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.B;
        return iHashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "ScoreValueNetworkEntity(id=" + this.t + ", rounds=" + this.u + ", reps=" + this.v + ", value=" + this.w + ", adjusted=" + this.x + ", position=" + this.y + ", intervalValues=" + this.z + ", linkMedia=" + this.A + ", linkNotes=" + this.B + ")";
    }
}
