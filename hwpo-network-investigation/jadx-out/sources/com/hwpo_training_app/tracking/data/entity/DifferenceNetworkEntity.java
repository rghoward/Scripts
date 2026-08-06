package com.hwpo_training_app.tracking.data.entity;

import defpackage.f93;
import defpackage.hv5;
import defpackage.j26;
import defpackage.lt0;
import defpackage.n03;
import defpackage.rd9;
import defpackage.ss5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public enum DifferenceNetworkEntity implements f93<n03> {
    /* JADX INFO: Fake field, exist only in values array */
    EF2 { // from class: com.hwpo_training_app.tracking.data.entity.DifferenceNetworkEntity.a
        @Override // defpackage.f93
        public final n03 a() {
            return n03.t;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF7 { // from class: com.hwpo_training_app.tracking.data.entity.DifferenceNetworkEntity.b
        @Override // defpackage.f93
        public final n03 a() {
            return n03.u;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF12 { // from class: com.hwpo_training_app.tracking.data.entity.DifferenceNetworkEntity.c
        @Override // defpackage.f93
        public final n03 a() {
            return n03.v;
        }
    };

    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>> t = hv5.c(j26.t, new lt0(2));

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<DifferenceNetworkEntity> serializer() {
            return (KSerializer) DifferenceNetworkEntity.t.getValue();
        }
    }

    DifferenceNetworkEntity() {
        throw null;
    }
}
