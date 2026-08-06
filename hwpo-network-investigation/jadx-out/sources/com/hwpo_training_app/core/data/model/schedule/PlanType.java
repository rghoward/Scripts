package com.hwpo_training_app.core.data.model.schedule;

import defpackage.a08;
import defpackage.f93;
import defpackage.hv5;
import defpackage.i08;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public enum PlanType implements f93<a08.a> {
    /* JADX INFO: Fake field, exist only in values array */
    EF2 { // from class: com.hwpo_training_app.core.data.model.schedule.PlanType.a
        @Override // defpackage.f93
        public final a08.a a() {
            return a08.a.t;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF7 { // from class: com.hwpo_training_app.core.data.model.schedule.PlanType.d
        @Override // defpackage.f93
        public final a08.a a() {
            return a08.a.u;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF12 { // from class: com.hwpo_training_app.core.data.model.schedule.PlanType.g
        @Override // defpackage.f93
        public final a08.a a() {
            return a08.a.v;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF17 { // from class: com.hwpo_training_app.core.data.model.schedule.PlanType.c
        @Override // defpackage.f93
        public final a08.a a() {
            return a08.a.w;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF22 { // from class: com.hwpo_training_app.core.data.model.schedule.PlanType.f
        @Override // defpackage.f93
        public final a08.a a() {
            return a08.a.x;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF27 { // from class: com.hwpo_training_app.core.data.model.schedule.PlanType.b
        @Override // defpackage.f93
        public final a08.a a() {
            return a08.a.y;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF32 { // from class: com.hwpo_training_app.core.data.model.schedule.PlanType.e
        @Override // defpackage.f93
        public final a08.a a() {
            return a08.a.z;
        }
    };

    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>> t = hv5.c(j26.t, new i08());

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<PlanType> serializer() {
            return (KSerializer) PlanType.t.getValue();
        }
    }

    PlanType() {
        throw null;
    }
}
