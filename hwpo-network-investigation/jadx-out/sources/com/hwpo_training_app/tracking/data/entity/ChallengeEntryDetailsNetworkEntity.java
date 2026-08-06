package com.hwpo_training_app.tracking.data.entity;

import com.hwpo_training_app.core.data.model.schedule.SchedulePerformanceNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.score.ScheduleScoreNetworkEntity;
import defpackage.bd8;
import defpackage.f93;
import defpackage.g93;
import defpackage.hl3;
import defpackage.m61;
import defpackage.os2;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.u43;
import defpackage.vc8;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class ChallengeEntryDetailsNetworkEntity implements f93<m61> {
    public static final Companion Companion = new Companion();
    public final int t;
    public final int u;
    public final String v;
    public final SchedulePerformanceNetworkEntity w;
    public final ScheduleScoreNetworkEntity x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<ChallengeEntryDetailsNetworkEntity> serializer() {
            return ChallengeEntryDetailsNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChallengeEntryDetailsNetworkEntity(int i, int i2, int i3, String str, SchedulePerformanceNetworkEntity schedulePerformanceNetworkEntity, ScheduleScoreNetworkEntity scheduleScoreNetworkEntity) {
        if (31 != (i & 31)) {
            hl3.b(i, 31, ChallengeEntryDetailsNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = i3;
        this.v = str;
        this.w = schedulePerformanceNetworkEntity;
        this.x = scheduleScoreNetworkEntity;
    }

    @Override // defpackage.f93
    public final m61 a() {
        bd8 bd8VarA = this.x.a();
        SchedulePerformanceNetworkEntity schedulePerformanceNetworkEntity = this.w;
        return new m61(this.u, this.t, this.v, schedulePerformanceNetworkEntity != null ? new vc8(schedulePerformanceNetworkEntity.t, schedulePerformanceNetworkEntity.u, g93.a(schedulePerformanceNetworkEntity.v)) : null, bd8VarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeEntryDetailsNetworkEntity)) {
            return false;
        }
        ChallengeEntryDetailsNetworkEntity challengeEntryDetailsNetworkEntity = (ChallengeEntryDetailsNetworkEntity) obj;
        return this.t == challengeEntryDetailsNetworkEntity.t && this.u == challengeEntryDetailsNetworkEntity.u && xj5.a(this.v, challengeEntryDetailsNetworkEntity.v) && xj5.a(this.w, challengeEntryDetailsNetworkEntity.w) && xj5.a(this.x, challengeEntryDetailsNetworkEntity.x);
    }

    public final int hashCode() {
        int iC = ru3.c(os2.a(this.u, Integer.hashCode(this.t) * 31, 31), 31, this.v);
        SchedulePerformanceNetworkEntity schedulePerformanceNetworkEntity = this.w;
        return this.x.hashCode() + ((iC + (schedulePerformanceNetworkEntity == null ? 0 : schedulePerformanceNetworkEntity.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbB = u43.b("ChallengeEntryDetailsNetworkEntity(sectionId=", ", scheduleId=", ", title=", this.t, this.u);
        sbB.append(this.v);
        sbB.append(", performance=");
        sbB.append(this.w);
        sbB.append(", score=");
        sbB.append(this.x);
        sbB.append(")");
        return sbB.toString();
    }
}
