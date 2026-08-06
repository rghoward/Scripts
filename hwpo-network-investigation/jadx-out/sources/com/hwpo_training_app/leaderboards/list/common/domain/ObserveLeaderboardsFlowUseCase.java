package com.hwpo_training_app.leaderboards.list.common.domain;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardType;
import com.hwpo_training_app.leaderboards.list.common.data.LeaderboardsRepositoryImpl;
import defpackage.f84;
import defpackage.g2b;
import defpackage.r02;
import defpackage.r54;
import defpackage.s54;
import defpackage.u02;
import defpackage.v72;
import defpackage.w5b;
import defpackage.xm2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ObserveLeaderboardsFlowUseCase extends f84<LeaderboardType, List<? extends LeaderboardModel>> {
    public final w5b a;
    public final LeaderboardsRepositoryImpl b;

    public ObserveLeaderboardsFlowUseCase(w5b w5bVar, LeaderboardsRepositoryImpl leaderboardsRepositoryImpl) {
        w5bVar.getClass();
        this.a = w5bVar;
        this.b = leaderboardsRepositoryImpl;
    }

    @Override // defpackage.f84
    public final r54<List<? extends LeaderboardModel>> a(LeaderboardType leaderboardType) {
        LeaderboardType leaderboardType2 = leaderboardType;
        leaderboardType2.getClass();
        final ObserveLeaderboardsFlowUseCase$executeOnBackground$$inlined$map$1 observeLeaderboardsFlowUseCase$executeOnBackground$$inlined$map$1 = new ObserveLeaderboardsFlowUseCase$executeOnBackground$$inlined$map$1(this.b.e, leaderboardType2);
        return new r54<List<? extends LeaderboardModel>>() { // from class: com.hwpo_training_app.leaderboards.list.common.domain.ObserveLeaderboardsFlowUseCase$executeOnBackground$$inlined$map$2

            /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.list.common.domain.ObserveLeaderboardsFlowUseCase$executeOnBackground$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class AnonymousClass2<T> implements s54 {
                public final /* synthetic */ s54 t;
                public final /* synthetic */ ObserveLeaderboardsFlowUseCase u;

                /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.list.common.domain.ObserveLeaderboardsFlowUseCase$executeOnBackground$$inlined$map$2$2$1, reason: invalid class name */
                @xm2(c = "com.hwpo_training_app.leaderboards.list.common.domain.ObserveLeaderboardsFlowUseCase$executeOnBackground$$inlined$map$2$2", f = "ObserveLeaderboardsFlowUseCase.kt", l = {228, 217}, m = "emit", v = 2)
                public static final class AnonymousClass1 extends u02 {
                    public LeaderboardModel A;
                    public Collection B;
                    public int C;
                    public int D;
                    public int E;
                    public /* synthetic */ Object t;
                    public int u;
                    public s54 v;
                    public int w;
                    public Collection y;
                    public Iterator z;

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

                public AnonymousClass2(s54 s54Var, ObserveLeaderboardsFlowUseCase observeLeaderboardsFlowUseCase) {
                    this.t = s54Var;
                    this.u = observeLeaderboardsFlowUseCase;
                }

                /* JADX WARN: Code duplicated, block: B:25:0x008f  */
                /* JADX WARN: Code duplicated, block: B:39:0x009f A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:40:0x009b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:23:0x0089->B:41:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Type inference failed for: r4v1, types: [com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardModel, java.util.Collection, java.util.Iterator, s54] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009b -> B:33:0x0121). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c2 -> B:32:0x00c5). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // defpackage.s54
                public final java.lang.Object emit(java.lang.Object r35, defpackage.r02 r36) {
                    /*
                        Method dump skipped, instruction units count: 328
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.hwpo_training_app.leaderboards.list.common.domain.ObserveLeaderboardsFlowUseCase$executeOnBackground$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, r02):java.lang.Object");
                }
            }

            @Override // defpackage.r54
            public final Object collect(s54<? super List<? extends LeaderboardModel>> s54Var, r02 r02Var) {
                Object objCollect = observeLeaderboardsFlowUseCase$executeOnBackground$$inlined$map$1.collect(new AnonymousClass2(s54Var, this), r02Var);
                return objCollect == v72.t ? objCollect : g2b.a;
            }
        };
    }
}
