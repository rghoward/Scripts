package com.hwpo_training_app.core.data.model.schedule;

import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity;
import defpackage.f93;
import defpackage.g93;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.il;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.vc8;
import defpackage.w25;
import defpackage.xj5;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class ProgramPerformanceNetworkEntity implements f93<vc8> {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] w = {null, null, hv5.c(j26.t, new w25(3))};
    public final int t;
    public final String u;
    public final List<SectionAttachmentNetworkEntity> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<ProgramPerformanceNetworkEntity> serializer() {
            return ProgramPerformanceNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProgramPerformanceNetworkEntity(int i, int i2, String str, List list) {
        if (7 != (i & 7)) {
            hl3.b(i, 7, ProgramPerformanceNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = str;
        this.v = list;
    }

    @Override // defpackage.f93
    public final vc8 a() {
        return new vc8(this.t, this.u, g93.a(this.v));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramPerformanceNetworkEntity)) {
            return false;
        }
        ProgramPerformanceNetworkEntity programPerformanceNetworkEntity = (ProgramPerformanceNetworkEntity) obj;
        return this.t == programPerformanceNetworkEntity.t && xj5.a(this.u, programPerformanceNetworkEntity.u) && xj5.a(this.v, programPerformanceNetworkEntity.v);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.t) * 31;
        String str = this.u;
        return this.v.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("ProgramPerformanceNetworkEntity(id=", ", text=", this.u, ", attachments=", this.t);
        sbA.append(this.v);
        sbA.append(")");
        return sbA.toString();
    }
}
