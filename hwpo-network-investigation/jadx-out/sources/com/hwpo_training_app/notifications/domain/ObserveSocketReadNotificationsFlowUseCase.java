package com.hwpo_training_app.notifications.domain;

import defpackage.aa0;
import defpackage.dv8;
import defpackage.f84;
import defpackage.g2b;
import defpackage.k74;
import defpackage.r02;
import defpackage.r54;
import defpackage.s54;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ObserveSocketReadNotificationsFlowUseCase extends f84<g2b, g2b> {
    public final NotificationsRepository a;

    public ObserveSocketReadNotificationsFlowUseCase(NotificationsRepository notificationsRepository) {
        notificationsRepository.getClass();
        this.a = notificationsRepository;
    }

    @Override // defpackage.f84
    public final r54<g2b> a(g2b g2bVar) {
        g2bVar.getClass();
        final k74 k74VarB = this.a.b();
        return new r54<g2b>() { // from class: com.hwpo_training_app.notifications.domain.ObserveSocketReadNotificationsFlowUseCase$executeOnBackground$$inlined$map$1

            /* JADX INFO: renamed from: com.hwpo_training_app.notifications.domain.ObserveSocketReadNotificationsFlowUseCase$executeOnBackground$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class AnonymousClass2<T> implements s54 {
                public final /* synthetic */ s54 t;

                /* JADX INFO: renamed from: com.hwpo_training_app.notifications.domain.ObserveSocketReadNotificationsFlowUseCase$executeOnBackground$$inlined$map$1$2$1, reason: invalid class name */
                @xm2(c = "com.hwpo_training_app.notifications.domain.ObserveSocketReadNotificationsFlowUseCase$executeOnBackground$$inlined$map$1$2", f = "ObserveSocketReadNotificationsFlowUseCase.kt", l = {217}, m = "emit", v = 2)
                public static final class AnonymousClass1 extends u02 {
                    public /* synthetic */ Object t;
                    public int u;

                    public AnonymousClass1(r02 r02Var) {
                        super(r02Var);
                    }

                    @Override // defpackage.ak0
                    public final Object invokeSuspend(Object obj) {
                        this.t = obj;
                        this.u |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(s54 s54Var) {
                    this.t = s54Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.s54
                public final Object emit(Object obj, r02 r02Var) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (r02Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) r02Var;
                        int i = anonymousClass1.u;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.u = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(r02Var);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(r02Var);
                    }
                    Object obj2 = anonymousClass1.t;
                    int i2 = anonymousClass1.u;
                    if (i2 == 0) {
                        dv8.b(obj2);
                        g2b g2bVar = g2b.a;
                        anonymousClass1.u = 1;
                        Object objEmit = this.t.emit(g2bVar, anonymousClass1);
                        v72 v72Var = v72.t;
                        if (objEmit == v72Var) {
                            return v72Var;
                        }
                    } else {
                        if (i2 != 1) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dv8.b(obj2);
                    }
                    return g2b.a;
                }
            }

            @Override // defpackage.r54
            public final Object collect(s54<? super g2b> s54Var, r02 r02Var) {
                Object objCollect = k74VarB.collect(new AnonymousClass2(s54Var), r02Var);
                return objCollect == v72.t ? objCollect : g2b.a;
            }
        };
    }
}
