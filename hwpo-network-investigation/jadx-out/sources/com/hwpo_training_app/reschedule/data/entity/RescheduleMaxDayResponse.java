package com.hwpo_training_app.reschedule.data.entity;

import defpackage.hl3;
import defpackage.pk;
import defpackage.rd9;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class RescheduleMaxDayResponse {
    public static final Companion Companion = new Companion();
    public final int a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<RescheduleMaxDayResponse> serializer() {
            return RescheduleMaxDayResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RescheduleMaxDayResponse(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            hl3.b(i, 1, RescheduleMaxDayResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RescheduleMaxDayResponse) && this.a == ((RescheduleMaxDayResponse) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pk.d(this.a, "RescheduleMaxDayResponse(day=", ")");
    }
}
