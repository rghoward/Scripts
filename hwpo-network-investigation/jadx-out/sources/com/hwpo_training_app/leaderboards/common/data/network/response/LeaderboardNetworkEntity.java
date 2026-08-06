package com.hwpo_training_app.leaderboards.common.data.network.response;

import com.hwpo_training_app.core.data.model.schedule.BenchmarkMeasureTypeNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.UnitsNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardKindNetworkEntity;
import defpackage.b46;
import defpackage.c46;
import defpackage.d46;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.il;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ss5;
import defpackage.tu1;
import defpackage.ux1;
import defpackage.xj5;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardNetworkEntity {
    public static final Companion Companion;
    public static final ss5<KSerializer<Object>>[] s;
    public final int a;
    public final String b;
    public final String c;
    public final LeaderboardKindNetworkEntity d;
    public final BenchmarkMeasureTypeNetworkEntity e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final LeaderboardPlanNetworkEntity i;
    public final LeaderboardSectionNetworkEntity j;
    public final List<String> k;
    public final Integer l;
    public final LeaderboardScheduleNetworkEntity m;
    public final UnitsNetworkEntity n;
    public final String o;
    public final String p;
    public final Long q;
    public final List<LeaderboardTopValueNetworkEntity> r;

    static {
        int i = 0;
        Companion = new Companion(i);
        b46 b46Var = new b46(i);
        j26 j26Var = j26.t;
        s = new ss5[]{null, null, null, hv5.c(j26Var, b46Var), hv5.c(j26Var, new c46()), null, null, null, null, null, hv5.c(j26Var, new d46()), null, null, null, null, null, null, hv5.c(j26Var, new tu1(1))};
    }

    public /* synthetic */ LeaderboardNetworkEntity(int i, int i2, String str, String str2, LeaderboardKindNetworkEntity leaderboardKindNetworkEntity, BenchmarkMeasureTypeNetworkEntity benchmarkMeasureTypeNetworkEntity, Integer num, Integer num2, Integer num3, LeaderboardPlanNetworkEntity leaderboardPlanNetworkEntity, LeaderboardSectionNetworkEntity leaderboardSectionNetworkEntity, List list, Integer num4, LeaderboardScheduleNetworkEntity leaderboardScheduleNetworkEntity, UnitsNetworkEntity unitsNetworkEntity, String str3, String str4, Long l, List list2) {
        if (24601 != (i & 24601)) {
            hl3.b(i, 24601, LeaderboardNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        this.d = leaderboardKindNetworkEntity;
        this.e = benchmarkMeasureTypeNetworkEntity;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = leaderboardPlanNetworkEntity;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = leaderboardSectionNetworkEntity;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list;
        }
        if ((i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) == 0) {
            this.l = null;
        } else {
            this.l = num4;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = leaderboardScheduleNetworkEntity;
        }
        this.n = unitsNetworkEntity;
        this.o = str3;
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str4;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = l;
        }
        if ((i & 131072) == 0) {
            this.r = null;
        } else {
            this.r = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardNetworkEntity)) {
            return false;
        }
        LeaderboardNetworkEntity leaderboardNetworkEntity = (LeaderboardNetworkEntity) obj;
        return this.a == leaderboardNetworkEntity.a && xj5.a(this.b, leaderboardNetworkEntity.b) && xj5.a(this.c, leaderboardNetworkEntity.c) && this.d == leaderboardNetworkEntity.d && this.e == leaderboardNetworkEntity.e && xj5.a(this.f, leaderboardNetworkEntity.f) && xj5.a(this.g, leaderboardNetworkEntity.g) && xj5.a(this.h, leaderboardNetworkEntity.h) && xj5.a(this.i, leaderboardNetworkEntity.i) && xj5.a(this.j, leaderboardNetworkEntity.j) && xj5.a(this.k, leaderboardNetworkEntity.k) && xj5.a(this.l, leaderboardNetworkEntity.l) && xj5.a(this.m, leaderboardNetworkEntity.m) && this.n == leaderboardNetworkEntity.n && xj5.a(this.o, leaderboardNetworkEntity.o) && xj5.a(this.p, leaderboardNetworkEntity.p) && xj5.a(this.q, leaderboardNetworkEntity.q) && xj5.a(this.r, leaderboardNetworkEntity.r);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        Integer num = this.f;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.h;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        LeaderboardPlanNetworkEntity leaderboardPlanNetworkEntity = this.i;
        int iHashCode7 = (iHashCode6 + (leaderboardPlanNetworkEntity == null ? 0 : leaderboardPlanNetworkEntity.hashCode())) * 31;
        LeaderboardSectionNetworkEntity leaderboardSectionNetworkEntity = this.j;
        int iHashCode8 = (iHashCode7 + (leaderboardSectionNetworkEntity == null ? 0 : leaderboardSectionNetworkEntity.hashCode())) * 31;
        List<String> list = this.k;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.l;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        LeaderboardScheduleNetworkEntity leaderboardScheduleNetworkEntity = this.m;
        int iC = ru3.c((this.n.hashCode() + ((iHashCode10 + (leaderboardScheduleNetworkEntity == null ? 0 : leaderboardScheduleNetworkEntity.hashCode())) * 31)) * 31, 31, this.o);
        String str3 = this.p;
        int iHashCode11 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.q;
        int iHashCode12 = (iHashCode11 + (l == null ? 0 : l.hashCode())) * 31;
        List<LeaderboardTopValueNetworkEntity> list2 = this.r;
        return iHashCode12 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = il.a("LeaderboardNetworkEntity(id=", ", title=", this.b, ", description=", this.a);
        sbA.append(this.c);
        sbA.append(", kind=");
        sbA.append(this.d);
        sbA.append(", measure=");
        sbA.append(this.e);
        sbA.append(", rounds=");
        sbA.append(this.f);
        sbA.append(", reps=");
        sbA.append(this.g);
        sbA.append(", countSubValue=");
        sbA.append(this.h);
        sbA.append(", plan=");
        sbA.append(this.i);
        sbA.append(", section=");
        sbA.append(this.j);
        sbA.append(", tags=");
        sbA.append(this.k);
        sbA.append(", commentsCount=");
        sbA.append(this.l);
        sbA.append(", schedule=");
        sbA.append(this.m);
        sbA.append(", units=");
        sbA.append(this.n);
        sbA.append(", symbol=");
        ux1.b(sbA, this.o, ", objective=", this.p, ", updatedAt=");
        sbA.append(this.q);
        sbA.append(", topValues=");
        sbA.append(this.r);
        sbA.append(")");
        return sbA.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardNetworkEntity> serializer() {
            return LeaderboardNetworkEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
