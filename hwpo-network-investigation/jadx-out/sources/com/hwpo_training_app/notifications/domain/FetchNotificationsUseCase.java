package com.hwpo_training_app.notifications.domain;

import defpackage.aa0;
import defpackage.cq2;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.u02;
import defpackage.v72;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FetchNotificationsUseCase extends g5b<Params, g2b> {
    public final NotificationsRepository a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Params {
        public final boolean a;

        public Params(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && this.a == ((Params) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return cq2.a("Params(loadFromStart=", ")", this.a);
        }
    }

    public FetchNotificationsUseCase(NotificationsRepository notificationsRepository) {
        notificationsRepository.getClass();
        this.a = notificationsRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(Params params, u02 u02Var) throws Throwable {
        FetchNotificationsUseCase$executeOnBackground$1 fetchNotificationsUseCase$executeOnBackground$1;
        if (u02Var instanceof FetchNotificationsUseCase$executeOnBackground$1) {
            fetchNotificationsUseCase$executeOnBackground$1 = (FetchNotificationsUseCase$executeOnBackground$1) u02Var;
            int i = fetchNotificationsUseCase$executeOnBackground$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchNotificationsUseCase$executeOnBackground$1.v = i - Integer.MIN_VALUE;
            } else {
                fetchNotificationsUseCase$executeOnBackground$1 = new FetchNotificationsUseCase$executeOnBackground$1(this, u02Var);
            }
        } else {
            fetchNotificationsUseCase$executeOnBackground$1 = new FetchNotificationsUseCase$executeOnBackground$1(this, u02Var);
        }
        Object obj = fetchNotificationsUseCase$executeOnBackground$1.t;
        int i2 = fetchNotificationsUseCase$executeOnBackground$1.v;
        if (i2 == 0) {
            dv8.b(obj);
            boolean z = params.a;
            fetchNotificationsUseCase$executeOnBackground$1.v = 1;
            Object objE = this.a.e(z, fetchNotificationsUseCase$executeOnBackground$1);
            v72 v72Var = v72.t;
            if (objE == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
