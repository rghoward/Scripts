package com.hwpo_training_app.core.data.model.schedule;

import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.score.ScheduleScoreNetworkEntity;
import defpackage.ao2;
import defpackage.bd8;
import defpackage.e46;
import defpackage.f46;
import defpackage.f93;
import defpackage.g93;
import defpackage.hd8;
import defpackage.hf3;
import defpackage.hl3;
import defpackage.ho2;
import defpackage.hv5;
import defpackage.il;
import defpackage.j26;
import defpackage.m89;
import defpackage.o89;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.tu1;
import defpackage.uo2;
import defpackage.vc8;
import defpackage.xj5;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class ProgramSectionNetworkEntity implements f93<hd8> {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] J;
    public final Boolean A;
    public final SectionAttachmentNetworkEntity B;
    public final List<SectionAttachmentNetworkEntity> C;
    public final List<BenchmarkNetworkEntity> D;
    public final SchedulePerformanceNetworkEntity E;
    public final Integer F;
    public final ScheduleScoreNetworkEntity G;
    public final String H;
    public final String I;
    public final int t;
    public final String u;
    public final SectionKindNetworkEntity v;
    public final Integer w;
    public final String x;
    public final boolean y;
    public final Boolean z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<ProgramSectionNetworkEntity> serializer() {
            return ProgramSectionNetworkEntity$$serializer.INSTANCE;
        }
    }

    static {
        tu1 tu1Var = new tu1(2);
        j26 j26Var = j26.t;
        int i = 1;
        J = new ss5[]{null, null, hv5.c(j26Var, tu1Var), null, null, null, null, null, null, hv5.c(j26Var, new e46(i)), hv5.c(j26Var, new f46(i)), null, null, null, null, null};
    }

    public /* synthetic */ ProgramSectionNetworkEntity(int i, int i2, String str, SectionKindNetworkEntity sectionKindNetworkEntity, Integer num, String str2, boolean z, Boolean bool, Boolean bool2, SectionAttachmentNetworkEntity sectionAttachmentNetworkEntity, List list, List list2, SchedulePerformanceNetworkEntity schedulePerformanceNetworkEntity, Integer num2, ScheduleScoreNetworkEntity scheduleScoreNetworkEntity, String str3, String str4) {
        if (37 != (i & 37)) {
            hl3.b(i, 37, ProgramSectionNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        if ((i & 2) == 0) {
            this.u = null;
        } else {
            this.u = str;
        }
        this.v = sectionKindNetworkEntity;
        if ((i & 8) == 0) {
            this.w = -1;
        } else {
            this.w = num;
        }
        if ((i & 16) == 0) {
            this.x = null;
        } else {
            this.x = str2;
        }
        this.y = z;
        if ((i & 64) == 0) {
            this.z = Boolean.FALSE;
        } else {
            this.z = bool;
        }
        if ((i & 128) == 0) {
            this.A = Boolean.FALSE;
        } else {
            this.A = bool2;
        }
        if ((i & 256) == 0) {
            this.B = null;
        } else {
            this.B = sectionAttachmentNetworkEntity;
        }
        if ((i & 512) == 0) {
            this.C = hf3.t;
        } else {
            this.C = list;
        }
        if ((i & 1024) == 0) {
            this.D = null;
        } else {
            this.D = list2;
        }
        if ((i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) == 0) {
            this.E = null;
        } else {
            this.E = schedulePerformanceNetworkEntity;
        }
        if ((i & 4096) == 0) {
            this.F = null;
        } else {
            this.F = num2;
        }
        if ((i & 8192) == 0) {
            this.G = null;
        } else {
            this.G = scheduleScoreNetworkEntity;
        }
        if ((i & 16384) == 0) {
            this.H = null;
        } else {
            this.H = str3;
        }
        if ((i & 32768) == 0) {
            this.I = null;
        } else {
            this.I = str4;
        }
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hd8 a() {
        SectionKindNetworkEntity sectionKindNetworkEntity = this.v;
        o89 o89VarA = sectionKindNetworkEntity.a();
        Integer num = this.w;
        int iIntValue = num != null ? num.intValue() : -1;
        Boolean bool = this.z;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = this.A;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        String str = null;
        SectionAttachmentNetworkEntity sectionAttachmentNetworkEntity = this.B;
        m89 m89VarA = sectionAttachmentNetworkEntity != null ? sectionAttachmentNetworkEntity.a() : null;
        List listA = g93.a(this.C);
        List listA2 = g93.a(this.D);
        SchedulePerformanceNetworkEntity schedulePerformanceNetworkEntity = this.E;
        vc8 vc8Var = schedulePerformanceNetworkEntity != null ? new vc8(schedulePerformanceNetworkEntity.t, schedulePerformanceNetworkEntity.u, g93.a(schedulePerformanceNetworkEntity.v)) : null;
        ScheduleScoreNetworkEntity scheduleScoreNetworkEntity = this.G;
        bd8 bd8VarB = scheduleScoreNetworkEntity != null ? scheduleScoreNetworkEntity.a() : null;
        int iOrdinal = sectionKindNetworkEntity.ordinal();
        if (iOrdinal == 4) {
            str = this.H;
        } else if (iOrdinal == 5) {
            str = this.I;
        }
        return new hd8(this.t, this.u, o89VarA, iIntValue, this.x, this.y, zBooleanValue, zBooleanValue2, m89VarA, listA, listA2, vc8Var, bd8VarB, str, this.F);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramSectionNetworkEntity)) {
            return false;
        }
        ProgramSectionNetworkEntity programSectionNetworkEntity = (ProgramSectionNetworkEntity) obj;
        return this.t == programSectionNetworkEntity.t && xj5.a(this.u, programSectionNetworkEntity.u) && this.v == programSectionNetworkEntity.v && xj5.a(this.w, programSectionNetworkEntity.w) && xj5.a(this.x, programSectionNetworkEntity.x) && this.y == programSectionNetworkEntity.y && xj5.a(this.z, programSectionNetworkEntity.z) && xj5.a(this.A, programSectionNetworkEntity.A) && xj5.a(this.B, programSectionNetworkEntity.B) && xj5.a(this.C, programSectionNetworkEntity.C) && xj5.a(this.D, programSectionNetworkEntity.D) && xj5.a(this.E, programSectionNetworkEntity.E) && xj5.a(this.F, programSectionNetworkEntity.F) && xj5.a(this.G, programSectionNetworkEntity.G) && xj5.a(this.H, programSectionNetworkEntity.H) && xj5.a(this.I, programSectionNetworkEntity.I);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.t) * 31;
        String str = this.u;
        int iHashCode2 = (this.v.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.w;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.x;
        int iA = uo2.a((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, this.y, 31);
        Boolean bool = this.z;
        int iHashCode4 = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        SectionAttachmentNetworkEntity sectionAttachmentNetworkEntity = this.B;
        int iA2 = ho2.a((iHashCode5 + (sectionAttachmentNetworkEntity == null ? 0 : sectionAttachmentNetworkEntity.hashCode())) * 31, 31, this.C);
        List<BenchmarkNetworkEntity> list = this.D;
        int iHashCode6 = (iA2 + (list == null ? 0 : list.hashCode())) * 31;
        SchedulePerformanceNetworkEntity schedulePerformanceNetworkEntity = this.E;
        int iHashCode7 = (iHashCode6 + (schedulePerformanceNetworkEntity == null ? 0 : schedulePerformanceNetworkEntity.hashCode())) * 31;
        Integer num2 = this.F;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ScheduleScoreNetworkEntity scheduleScoreNetworkEntity = this.G;
        int iHashCode9 = (iHashCode8 + (scheduleScoreNetworkEntity == null ? 0 : scheduleScoreNetworkEntity.hashCode())) * 31;
        String str3 = this.H;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.I;
        return iHashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = il.a("ProgramSectionNetworkEntity(id=", ", title=", this.u, ", kind=", this.t);
        sbA.append(this.v);
        sbA.append(", position=");
        sbA.append(this.w);
        sbA.append(", description=");
        sbA.append(this.x);
        sbA.append(", isCompleted=");
        sbA.append(this.y);
        sbA.append(", hasPerformance=");
        sbA.append(this.z);
        sbA.append(", hasFeedback=");
        sbA.append(this.A);
        sbA.append(", tipAttachment=");
        sbA.append(this.B);
        sbA.append(", attachments=");
        sbA.append(this.C);
        sbA.append(", benchmarks=");
        sbA.append(this.D);
        sbA.append(", performance=");
        sbA.append(this.E);
        sbA.append(", optionId=");
        sbA.append(this.F);
        sbA.append(", score=");
        sbA.append(this.G);
        sbA.append(", preWod=");
        return ao2.a(sbA, this.H, ", postWod=", this.I, ")");
    }
}
