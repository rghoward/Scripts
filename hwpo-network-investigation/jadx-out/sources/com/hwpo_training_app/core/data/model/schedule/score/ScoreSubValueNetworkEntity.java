package com.hwpo_training_app.core.data.model.schedule.score;

import defpackage.ci2;
import defpackage.f93;
import defpackage.hf3;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.os2;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ss5;
import defpackage.ux1;
import defpackage.w59;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class ScoreSubValueNetworkEntity implements f93<w59> {
    public final String A;
    public final ScoreMeasureTypeNetworkEntity B;
    public final int t;
    public final Integer u;
    public final Integer v;
    public final int w;
    public final Boolean x;
    public final Double y;
    public final String z;
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] C = {null, null, null, null, null, null, null, null, hv5.c(j26.t, new ci2(1))};

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<ScoreSubValueNetworkEntity> serializer() {
            return ScoreSubValueNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ScoreSubValueNetworkEntity(int i, int i2, Integer num, Integer num2, int i3, Boolean bool, Double d, String str, String str2, ScoreMeasureTypeNetworkEntity scoreMeasureTypeNetworkEntity) {
        if (457 != (i & 457)) {
            hl3.b(i, 457, ScoreSubValueNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        if ((i & 2) == 0) {
            this.u = null;
        } else {
            this.u = num;
        }
        if ((i & 4) == 0) {
            this.v = null;
        } else {
            this.v = num2;
        }
        this.w = i3;
        if ((i & 16) == 0) {
            this.x = null;
        } else {
            this.x = bool;
        }
        if ((i & 32) == 0) {
            this.y = null;
        } else {
            this.y = d;
        }
        this.z = str;
        this.A = str2;
        this.B = scoreMeasureTypeNetworkEntity;
    }

    @Override // defpackage.f93
    public final w59 a() {
        Integer num = this.u;
        int iIntValue = num != null ? num.intValue() : -1;
        Integer num2 = this.v;
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        Double d = this.y;
        return new w59(this.t, iIntValue, iIntValue2, d != null ? d.doubleValue() : -1.0d, false, this.w, hf3.t, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScoreSubValueNetworkEntity)) {
            return false;
        }
        ScoreSubValueNetworkEntity scoreSubValueNetworkEntity = (ScoreSubValueNetworkEntity) obj;
        return this.t == scoreSubValueNetworkEntity.t && xj5.a(this.u, scoreSubValueNetworkEntity.u) && xj5.a(this.v, scoreSubValueNetworkEntity.v) && this.w == scoreSubValueNetworkEntity.w && xj5.a(this.x, scoreSubValueNetworkEntity.x) && xj5.a(this.y, scoreSubValueNetworkEntity.y) && xj5.a(this.z, scoreSubValueNetworkEntity.z) && xj5.a(this.A, scoreSubValueNetworkEntity.A) && this.B == scoreSubValueNetworkEntity.B;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.t) * 31;
        Integer num = this.u;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.v;
        int iA = os2.a(this.w, (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        Boolean bool = this.x;
        int iHashCode3 = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.y;
        return this.B.hashCode() + ru3.c(ru3.c((iHashCode3 + (d != null ? d.hashCode() : 0)) * 31, 31, this.z), 31, this.A);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScoreSubValueNetworkEntity(id=");
        sb.append(this.t);
        sb.append(", rounds=");
        sb.append(this.u);
        sb.append(", reps=");
        sb.append(this.v);
        sb.append(", position=");
        sb.append(this.w);
        sb.append(", isTakenInto=");
        sb.append(this.x);
        sb.append(", value=");
        sb.append(this.y);
        sb.append(", units=");
        ux1.b(sb, this.z, ", symbol=", this.A, ", measure=");
        sb.append(this.B);
        sb.append(")");
        return sb.toString();
    }
}
