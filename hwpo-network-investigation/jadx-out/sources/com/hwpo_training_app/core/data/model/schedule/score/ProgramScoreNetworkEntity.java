package com.hwpo_training_app.core.data.model.schedule.score;

import defpackage.av;
import defpackage.b46;
import defpackage.bd8;
import defpackage.cd8;
import defpackage.f93;
import defpackage.hf3;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.u59;
import defpackage.w59;
import defpackage.xj5;
import defpackage.ym;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class ProgramScoreNetworkEntity implements f93<bd8> {
    public static final ss5<KSerializer<Object>>[] C;
    public static final Companion Companion = new Companion();
    public final ScoreValueNetworkEntity A;
    public final String B;
    public final int t;
    public final ScoreMeasureTypeNetworkEntity u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final List<String> z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<ProgramScoreNetworkEntity> serializer() {
            return ProgramScoreNetworkEntity$$serializer.INSTANCE;
        }
    }

    static {
        cd8 cd8Var = new cd8(0);
        j26 j26Var = j26.t;
        C = new ss5[]{null, hv5.c(j26Var, cd8Var), null, null, null, null, hv5.c(j26Var, new b46(1)), null, null};
    }

    public /* synthetic */ ProgramScoreNetworkEntity(int i, int i2, ScoreMeasureTypeNetworkEntity scoreMeasureTypeNetworkEntity, Integer num, Integer num2, Integer num3, Integer num4, List list, ScoreValueNetworkEntity scoreValueNetworkEntity, String str) {
        if (259 != (i & 259)) {
            hl3.b(i, 259, ProgramScoreNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = scoreMeasureTypeNetworkEntity;
        if ((i & 4) == 0) {
            this.v = null;
        } else {
            this.v = num;
        }
        if ((i & 8) == 0) {
            this.w = null;
        } else {
            this.w = num2;
        }
        if ((i & 16) == 0) {
            this.x = null;
        } else {
            this.x = num3;
        }
        if ((i & 32) == 0) {
            this.y = null;
        } else {
            this.y = num4;
        }
        if ((i & 64) == 0) {
            this.z = null;
        } else {
            this.z = list;
        }
        if ((i & 128) == 0) {
            this.A = null;
        } else {
            this.A = scoreValueNetworkEntity;
        }
        this.B = str;
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bd8 a() {
        ScoreMeasureTypeNetworkEntity scoreMeasureTypeNetworkEntity = this.u;
        u59 u59VarA = scoreMeasureTypeNetworkEntity.a();
        Integer num = this.v;
        int iIntValue = num != null ? num.intValue() : -1;
        Integer num2 = this.w;
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        Integer num3 = this.x;
        int iIntValue3 = num3 != null ? num3.intValue() : -1;
        Integer num4 = this.y;
        int iIntValue4 = num4 != null ? num4.intValue() : -1;
        List list = this.z;
        if (list == null) {
            list = hf3.t;
        }
        List list2 = list;
        ScoreValueNetworkEntity scoreValueNetworkEntity = this.A;
        return new bd8(this.t, u59VarA, iIntValue, ym.e(scoreMeasureTypeNetworkEntity.a(), num4, num), iIntValue2, iIntValue3, iIntValue4, list2, scoreValueNetworkEntity != null ? scoreValueNetworkEntity.a() : w59.a.a(w59.Companion, 0, null, 3), this.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramScoreNetworkEntity)) {
            return false;
        }
        ProgramScoreNetworkEntity programScoreNetworkEntity = (ProgramScoreNetworkEntity) obj;
        return this.t == programScoreNetworkEntity.t && this.u == programScoreNetworkEntity.u && xj5.a(this.v, programScoreNetworkEntity.v) && xj5.a(this.w, programScoreNetworkEntity.w) && xj5.a(this.x, programScoreNetworkEntity.x) && xj5.a(this.y, programScoreNetworkEntity.y) && xj5.a(this.z, programScoreNetworkEntity.z) && xj5.a(this.A, programScoreNetworkEntity.A) && xj5.a(this.B, programScoreNetworkEntity.B);
    }

    public final int hashCode() {
        int iHashCode = (this.u.hashCode() + (Integer.hashCode(this.t) * 31)) * 31;
        Integer num = this.v;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.w;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.x;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.y;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<String> list = this.z;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        ScoreValueNetworkEntity scoreValueNetworkEntity = this.A;
        return this.B.hashCode() + ((iHashCode6 + (scoreValueNetworkEntity != null ? scoreValueNetworkEntity.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgramScoreNetworkEntity(id=");
        sb.append(this.t);
        sb.append(", measure=");
        sb.append(this.u);
        sb.append(", objective=");
        sb.append(this.v);
        sb.append(", rounds=");
        sb.append(this.w);
        sb.append(", reps=");
        sb.append(this.x);
        sb.append(", intervalsCount=");
        sb.append(this.y);
        sb.append(", description=");
        sb.append(this.z);
        sb.append(", value=");
        sb.append(this.A);
        sb.append(", symbol=");
        return av.a(sb, this.B, ")");
    }
}
