package com.hwpo_training_app.core.data.model.gym;

import defpackage.ds4;
import defpackage.f93;
import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.s22;
import defpackage.ss5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public enum GymTypeNetworkEntity implements f93<ds4> {
    /* JADX INFO: Fake field, exist only in values array */
    EF2 { // from class: com.hwpo_training_app.core.data.model.gym.GymTypeNetworkEntity.b
        @Override // defpackage.f93
        public final ds4 a() {
            return ds4.t;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF7 { // from class: com.hwpo_training_app.core.data.model.gym.GymTypeNetworkEntity.c
        @Override // defpackage.f93
        public final ds4 a() {
            return ds4.u;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF12 { // from class: com.hwpo_training_app.core.data.model.gym.GymTypeNetworkEntity.a
        @Override // defpackage.f93
        public final ds4 a() {
            return ds4.v;
        }
    };

    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>> t = hv5.c(j26.t, new s22(1));

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<GymTypeNetworkEntity> serializer() {
            return (KSerializer) GymTypeNetworkEntity.t.getValue();
        }
    }

    GymTypeNetworkEntity() {
        throw null;
    }
}
