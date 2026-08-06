package com.hwpo_training_app.leaderboards.common.data.network.response;

import defpackage.h44;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.m46;
import defpackage.os2;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ss5;
import defpackage.ux1;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardScoreSubValueNetworkEntity {
    public static final Companion Companion = new Companion(0);
    public static final ss5<KSerializer<Object>>[] j = {null, null, null, null, null, null, null, null, hv5.c(j26.t, new m46())};
    public final int a;
    public final Integer b;
    public final Integer c;
    public final int d;
    public final Boolean e;
    public final float f;
    public final String g;
    public final String h;
    public final LeaderboardMeasureNetworkEntity i;

    public /* synthetic */ LeaderboardScoreSubValueNetworkEntity(int i, int i2, Integer num, Integer num2, int i3, Boolean bool, float f, String str, String str2, LeaderboardMeasureNetworkEntity leaderboardMeasureNetworkEntity) {
        if (489 != (i & 489)) {
            hl3.b(i, 489, LeaderboardScoreSubValueNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        this.d = i3;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        this.f = f;
        this.g = str;
        this.h = str2;
        this.i = leaderboardMeasureNetworkEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardScoreSubValueNetworkEntity)) {
            return false;
        }
        LeaderboardScoreSubValueNetworkEntity leaderboardScoreSubValueNetworkEntity = (LeaderboardScoreSubValueNetworkEntity) obj;
        return this.a == leaderboardScoreSubValueNetworkEntity.a && xj5.a(this.b, leaderboardScoreSubValueNetworkEntity.b) && xj5.a(this.c, leaderboardScoreSubValueNetworkEntity.c) && this.d == leaderboardScoreSubValueNetworkEntity.d && xj5.a(this.e, leaderboardScoreSubValueNetworkEntity.e) && Float.compare(this.f, leaderboardScoreSubValueNetworkEntity.f) == 0 && xj5.a(this.g, leaderboardScoreSubValueNetworkEntity.g) && xj5.a(this.h, leaderboardScoreSubValueNetworkEntity.h) && this.i == leaderboardScoreSubValueNetworkEntity.i;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iA = os2.a(this.d, (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        Boolean bool = this.e;
        return this.i.hashCode() + ru3.c(ru3.c(h44.a((iA + (bool != null ? bool.hashCode() : 0)) * 31, this.f, 31), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardScoreSubValueNetworkEntity(id=");
        sb.append(this.a);
        sb.append(", rounds=");
        sb.append(this.b);
        sb.append(", reps=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", isTakenInto=");
        sb.append(this.e);
        sb.append(", value=");
        sb.append(this.f);
        sb.append(", units=");
        ux1.b(sb, this.g, ", symbol=", this.h, ", measure=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardScoreSubValueNetworkEntity> serializer() {
            return LeaderboardScoreSubValueNetworkEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
