package com.hwpo_training_app.leaderboards.valuedetails.data.network.response;

import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardMeasureNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardResultTypeNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardScoreSubValueNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardUserNetworkEntity;
import defpackage.b56;
import defpackage.e4;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.oh;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ss5;
import defpackage.uo2;
import defpackage.ux1;
import defpackage.xj5;
import defpackage.y00;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardValueDetailsNetworkEntity {
    public static final Companion Companion;
    public static final ss5<KSerializer<Object>>[] u;
    public final int a;
    public final boolean b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Float k;
    public final List<LeaderboardScoreSubValueNetworkEntity> l;
    public final String m;
    public final String n;
    public final LeaderboardMeasureNetworkEntity o;
    public final LeaderboardUserNetworkEntity p;
    public final LeaderboardResultTypeNetworkEntity q;
    public final boolean r;
    public final boolean s;
    public final LeaderboardValueParentInfoNetworkEntity t;

    static {
        int i = 0;
        Companion = new Companion(i);
        int i2 = 1;
        y00 y00Var = new y00(i2);
        j26 j26Var = j26.t;
        u = new ss5[]{null, null, null, null, null, null, null, null, null, null, null, hv5.c(j26Var, y00Var), null, null, hv5.c(j26Var, new b56(i)), null, hv5.c(j26Var, new oh(i2)), null, null, null};
    }

    public /* synthetic */ LeaderboardValueDetailsNetworkEntity(int i, int i2, boolean z, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean z2, boolean z3, boolean z4, Float f, List list, String str, String str2, LeaderboardMeasureNetworkEntity leaderboardMeasureNetworkEntity, LeaderboardUserNetworkEntity leaderboardUserNetworkEntity, LeaderboardResultTypeNetworkEntity leaderboardResultTypeNetworkEntity, boolean z5, boolean z6, LeaderboardValueParentInfoNetworkEntity leaderboardValueParentInfoNetworkEntity) {
        if (1045379 != (i & 1045379)) {
            hl3.b(i, 1045379, LeaderboardValueDetailsNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = z;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num5;
        }
        this.h = z2;
        this.i = z3;
        this.j = z4;
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = f;
        }
        if ((i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) == 0) {
            this.l = null;
        } else {
            this.l = list;
        }
        this.m = str;
        this.n = str2;
        this.o = leaderboardMeasureNetworkEntity;
        this.p = leaderboardUserNetworkEntity;
        this.q = leaderboardResultTypeNetworkEntity;
        this.r = z5;
        this.s = z6;
        this.t = leaderboardValueParentInfoNetworkEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardValueDetailsNetworkEntity)) {
            return false;
        }
        LeaderboardValueDetailsNetworkEntity leaderboardValueDetailsNetworkEntity = (LeaderboardValueDetailsNetworkEntity) obj;
        return this.a == leaderboardValueDetailsNetworkEntity.a && this.b == leaderboardValueDetailsNetworkEntity.b && xj5.a(this.c, leaderboardValueDetailsNetworkEntity.c) && xj5.a(this.d, leaderboardValueDetailsNetworkEntity.d) && xj5.a(this.e, leaderboardValueDetailsNetworkEntity.e) && xj5.a(this.f, leaderboardValueDetailsNetworkEntity.f) && xj5.a(this.g, leaderboardValueDetailsNetworkEntity.g) && this.h == leaderboardValueDetailsNetworkEntity.h && this.i == leaderboardValueDetailsNetworkEntity.i && this.j == leaderboardValueDetailsNetworkEntity.j && xj5.a(this.k, leaderboardValueDetailsNetworkEntity.k) && xj5.a(this.l, leaderboardValueDetailsNetworkEntity.l) && xj5.a(this.m, leaderboardValueDetailsNetworkEntity.m) && xj5.a(this.n, leaderboardValueDetailsNetworkEntity.n) && this.o == leaderboardValueDetailsNetworkEntity.o && xj5.a(this.p, leaderboardValueDetailsNetworkEntity.p) && this.q == leaderboardValueDetailsNetworkEntity.q && this.r == leaderboardValueDetailsNetworkEntity.r && this.s == leaderboardValueDetailsNetworkEntity.s && xj5.a(this.t, leaderboardValueDetailsNetworkEntity.t);
    }

    public final int hashCode() {
        int iA = uo2.a(Integer.hashCode(this.a) * 31, this.b, 31);
        Integer num = this.c;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.g;
        int iA2 = uo2.a(uo2.a(uo2.a((iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31, this.h, 31), this.i, 31), this.j, 31);
        Float f = this.k;
        int iHashCode5 = (iA2 + (f == null ? 0 : f.hashCode())) * 31;
        List<LeaderboardScoreSubValueNetworkEntity> list = this.l;
        return this.t.hashCode() + uo2.a(uo2.a((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ru3.c(ru3.c((iHashCode5 + (list != null ? list.hashCode() : 0)) * 31, 31, this.m), 31, this.n)) * 31)) * 31)) * 31, this.r, 31), this.s, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardValueDetailsNetworkEntity(id=");
        sb.append(this.a);
        sb.append(", isHidden=");
        sb.append(this.b);
        sb.append(", commentsCount=");
        sb.append(this.c);
        sb.append(", attachmentsCount=");
        sb.append(this.d);
        sb.append(", likesCount=");
        sb.append(this.e);
        sb.append(", rounds=");
        sb.append(this.f);
        sb.append(", reps=");
        sb.append(this.g);
        sb.append(", showAttachments=");
        sb.append(this.h);
        sb.append(", showPerformance=");
        e4.a(sb, this.i, ", isAdjusted=", this.j, ", value=");
        sb.append(this.k);
        sb.append(", scoreSubValues=");
        sb.append(this.l);
        sb.append(", units=");
        ux1.b(sb, this.m, ", symbol=", this.n, ", measure=");
        sb.append(this.o);
        sb.append(", user=");
        sb.append(this.p);
        sb.append(", resultType=");
        sb.append(this.q);
        sb.append(", isMyLike=");
        sb.append(this.r);
        sb.append(", isPerformancePresent=");
        sb.append(this.s);
        sb.append(", parentInfo=");
        sb.append(this.t);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardValueDetailsNetworkEntity> serializer() {
            return LeaderboardValueDetailsNetworkEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
