package com.hwpo_training_app.tracking.data.entity;

import com.hwpo_training_app.core.data.model.schedule.BenchmarkMeasureTypeNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.UnitsNetworkEntity;
import defpackage.gn7;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.il;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ss5;
import defpackage.t88;
import defpackage.xj5;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class TrackedValueNetworkEntity {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] m;
    public final int a;
    public final String b;
    public final BenchmarkMeasureTypeNetworkEntity c;
    public final Double d;
    public final Double e;
    public final DifferenceNetworkEntity f;
    public final String g;
    public final UnitsNetworkEntity h;
    public final String i;
    public final Integer j;
    public final Integer k;
    public final Integer l;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<TrackedValueNetworkEntity> serializer() {
            return TrackedValueNetworkEntity$$serializer.INSTANCE;
        }
    }

    static {
        t88 t88Var = new t88(1);
        j26 j26Var = j26.t;
        m = new ss5[]{null, null, hv5.c(j26Var, t88Var), null, null, hv5.c(j26Var, new gn7(1)), null, null, null, null, null, null};
    }

    public /* synthetic */ TrackedValueNetworkEntity(int i, int i2, String str, BenchmarkMeasureTypeNetworkEntity benchmarkMeasureTypeNetworkEntity, Double d, Double d2, DifferenceNetworkEntity differenceNetworkEntity, String str2, UnitsNetworkEntity unitsNetworkEntity, String str3, Integer num, Integer num2, Integer num3) {
        if (135 != (i & 135)) {
            hl3.b(i, 135, TrackedValueNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = benchmarkMeasureTypeNetworkEntity;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = differenceNetworkEntity;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        this.h = unitsNetworkEntity;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num2;
        }
        if ((i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) == 0) {
            this.l = null;
        } else {
            this.l = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackedValueNetworkEntity)) {
            return false;
        }
        TrackedValueNetworkEntity trackedValueNetworkEntity = (TrackedValueNetworkEntity) obj;
        return this.a == trackedValueNetworkEntity.a && xj5.a(this.b, trackedValueNetworkEntity.b) && this.c == trackedValueNetworkEntity.c && xj5.a(this.d, trackedValueNetworkEntity.d) && xj5.a(this.e, trackedValueNetworkEntity.e) && this.f == trackedValueNetworkEntity.f && xj5.a(this.g, trackedValueNetworkEntity.g) && this.h == trackedValueNetworkEntity.h && xj5.a(this.i, trackedValueNetworkEntity.i) && xj5.a(this.j, trackedValueNetworkEntity.j) && xj5.a(this.k, trackedValueNetworkEntity.k) && xj5.a(this.l, trackedValueNetworkEntity.l);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Double d = this.d;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        DifferenceNetworkEntity differenceNetworkEntity = this.f;
        int iHashCode4 = (iHashCode3 + (differenceNetworkEntity == null ? 0 : differenceNetworkEntity.hashCode())) * 31;
        String str = this.g;
        int iHashCode5 = (this.h.hashCode() + ((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.i;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.j;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.k;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.l;
        return iHashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = il.a("TrackedValueNetworkEntity(id=", ", name=", this.b, ", measure=", this.a);
        sbA.append(this.c);
        sbA.append(", value=");
        sbA.append(this.d);
        sbA.append(", secondValue=");
        sbA.append(this.e);
        sbA.append(", difference=");
        sbA.append(this.f);
        sbA.append(", description=");
        sbA.append(this.g);
        sbA.append(", units=");
        sbA.append(this.h);
        sbA.append(", symbol=");
        sbA.append(this.i);
        sbA.append(", progress=");
        sbA.append(this.j);
        sbA.append(", rounds=");
        sbA.append(this.k);
        sbA.append(", reps=");
        sbA.append(this.l);
        sbA.append(")");
        return sbA.toString();
    }
}
