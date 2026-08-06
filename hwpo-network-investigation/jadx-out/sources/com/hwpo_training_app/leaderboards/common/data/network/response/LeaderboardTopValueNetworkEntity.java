package com.hwpo_training_app.leaderboards.common.data.network.response;

import defpackage.e4;
import defpackage.h44;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.os2;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.s46;
import defpackage.ss5;
import defpackage.t46;
import defpackage.u43;
import defpackage.u46;
import defpackage.uo2;
import defpackage.xj5;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardTopValueNetworkEntity {
    public static final Companion Companion = new Companion(0);
    public static final ss5<KSerializer<Object>>[] u;
    public final int a;
    public final int b;
    public final boolean c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final float l;
    public final List<LeaderboardScoreSubValueNetworkEntity> m;
    public final String n;
    public final String o;
    public final LeaderboardMeasureNetworkEntity p;
    public final LeaderboardUserNetworkEntity q;
    public final LeaderboardResultTypeNetworkEntity r;
    public final boolean s;
    public final boolean t;

    static {
        s46 s46Var = new s46();
        j26 j26Var = j26.t;
        u = new ss5[]{null, null, null, null, null, null, null, null, null, null, null, null, hv5.c(j26Var, s46Var), null, null, hv5.c(j26Var, new t46()), null, hv5.c(j26Var, new u46()), null, null};
    }

    public /* synthetic */ LeaderboardTopValueNetworkEntity(int i, int i2, int i3, boolean z, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean z2, boolean z3, boolean z4, float f, List list, String str, String str2, LeaderboardMeasureNetworkEntity leaderboardMeasureNetworkEntity, LeaderboardUserNetworkEntity leaderboardUserNetworkEntity, LeaderboardResultTypeNetworkEntity leaderboardResultTypeNetworkEntity, boolean z5, boolean z6) {
        if (1044231 != (i & 1044231)) {
            hl3.b(i, 1044231, LeaderboardTopValueNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = z;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num5;
        }
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = f;
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = list;
        }
        this.n = str;
        this.o = str2;
        this.p = leaderboardMeasureNetworkEntity;
        this.q = leaderboardUserNetworkEntity;
        this.r = leaderboardResultTypeNetworkEntity;
        this.s = z5;
        this.t = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardTopValueNetworkEntity)) {
            return false;
        }
        LeaderboardTopValueNetworkEntity leaderboardTopValueNetworkEntity = (LeaderboardTopValueNetworkEntity) obj;
        return this.a == leaderboardTopValueNetworkEntity.a && this.b == leaderboardTopValueNetworkEntity.b && this.c == leaderboardTopValueNetworkEntity.c && xj5.a(this.d, leaderboardTopValueNetworkEntity.d) && xj5.a(this.e, leaderboardTopValueNetworkEntity.e) && xj5.a(this.f, leaderboardTopValueNetworkEntity.f) && xj5.a(this.g, leaderboardTopValueNetworkEntity.g) && xj5.a(this.h, leaderboardTopValueNetworkEntity.h) && this.i == leaderboardTopValueNetworkEntity.i && this.j == leaderboardTopValueNetworkEntity.j && this.k == leaderboardTopValueNetworkEntity.k && Float.compare(this.l, leaderboardTopValueNetworkEntity.l) == 0 && xj5.a(this.m, leaderboardTopValueNetworkEntity.m) && xj5.a(this.n, leaderboardTopValueNetworkEntity.n) && xj5.a(this.o, leaderboardTopValueNetworkEntity.o) && this.p == leaderboardTopValueNetworkEntity.p && xj5.a(this.q, leaderboardTopValueNetworkEntity.q) && this.r == leaderboardTopValueNetworkEntity.r && this.s == leaderboardTopValueNetworkEntity.s && this.t == leaderboardTopValueNetworkEntity.t;
    }

    public final int hashCode() {
        int iA = uo2.a(os2.a(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31);
        Integer num = this.d;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.g;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.h;
        int iA2 = h44.a(uo2.a(uo2.a(uo2.a((iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31, this.i, 31), this.j, 31), this.k, 31), this.l, 31);
        List<LeaderboardScoreSubValueNetworkEntity> list = this.m;
        return Boolean.hashCode(this.t) + uo2.a((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ru3.c(ru3.c((iA2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.n), 31, this.o)) * 31)) * 31)) * 31, this.s, 31);
    }

    public final String toString() {
        StringBuilder sbB = u43.b("LeaderboardTopValueNetworkEntity(id=", ", place=", ", isHidden=", this.a, this.b);
        sbB.append(this.c);
        sbB.append(", commentsCount=");
        sbB.append(this.d);
        sbB.append(", attachmentsCount=");
        sbB.append(this.e);
        sbB.append(", likesCount=");
        sbB.append(this.f);
        sbB.append(", rounds=");
        sbB.append(this.g);
        sbB.append(", reps=");
        sbB.append(this.h);
        sbB.append(", showAttachments=");
        e4.a(sbB, this.i, ", showPerformance=", this.j, ", isAdjusted=");
        sbB.append(this.k);
        sbB.append(", value=");
        sbB.append(this.l);
        sbB.append(", scoreSubValues=");
        sbB.append(this.m);
        sbB.append(", units=");
        sbB.append(this.n);
        sbB.append(", symbol=");
        sbB.append(this.o);
        sbB.append(", measure=");
        sbB.append(this.p);
        sbB.append(", user=");
        sbB.append(this.q);
        sbB.append(", resultType=");
        sbB.append(this.r);
        sbB.append(", isMyLike=");
        sbB.append(this.s);
        sbB.append(", isPerformancePresent=");
        sbB.append(this.t);
        sbB.append(")");
        return sbB.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardTopValueNetworkEntity> serializer() {
            return LeaderboardTopValueNetworkEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
