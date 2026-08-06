package io.intercom.android.sdk.tickets.list.reducers;

import defpackage.a06;
import defpackage.ca5;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.l49;
import defpackage.mh4;
import defpackage.nr1;
import defpackage.qk5;
import defpackage.ub6;
import defpackage.z;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsListReducerKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final TicketsScreenUiState reduceToTicketsScreenUiState(final a06<TicketRowData> a06Var, mh4<AppConfig> mh4Var, jt1 jt1Var, int i, int i2) {
        mh4<AppConfig> mh4Var2;
        TicketsScreenUiState empty;
        TicketsScreenUiState.Error error;
        a06Var.getClass();
        jt1Var.K(-356015290);
        int i3 = 1;
        int i4 = i2 & 1;
        jt1.a.C0187a c0187a = jt1.a.a;
        if (i4 != 0) {
            jt1Var.K(-374398905);
            Object objF = jt1Var.f();
            if (objF == c0187a) {
                objF = new l49(i3);
                jt1Var.C(objF);
            }
            mh4Var2 = (mh4) objF;
            jt1Var.B();
        } else {
            mh4Var2 = mh4Var;
        }
        String spaceLabelIfExists = mh4Var2.invoke().getSpaceLabelIfExists(Space.Type.TICKETS);
        jt1Var.K(-374395883);
        if (spaceLabelIfExists == null) {
            spaceLabelIfExists = nr1.f(jt1Var, R.string.intercom_tickets_space_title);
        }
        jt1Var.B();
        if (((qk5) a06Var.d.getValue()).d() != 0) {
            jt1Var.K(-374388312);
            boolean z = a06Var.b().c instanceof ub6.b;
            ub6 ub6Var = a06Var.b().c;
            ErrorState withoutCTA = null;
            ub6.a aVar = ub6Var instanceof ub6.a ? (ub6.a) ub6Var : null;
            if (aVar != null) {
                boolean z2 = aVar.b instanceof IOException;
                jt1Var.K(-374380409);
                if (z2) {
                    jt1Var.K(321780487);
                    if ((((i & 14) ^ 6) <= 4 || !jt1Var.j(a06Var)) && (i & 6) != 4) {
                        i3 = 0;
                    }
                    Object objF2 = jt1Var.f();
                    if (i3 != 0 || objF2 == c0187a) {
                        objF2 = new mh4() { // from class: mma
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TicketsListReducerKt.reduceToTicketsScreenUiState$lambda$4$lambda$3$lambda$2(a06Var);
                            }
                        };
                        jt1Var.C(objF2);
                    }
                    jt1Var.B();
                    withoutCTA = new ErrorState.WithCTA(0, 0, null, 0, (mh4) objF2, 15, null);
                } else {
                    withoutCTA = new ErrorState.WithoutCTA(0, 0, null, 7, null);
                }
                jt1Var.B();
            }
            empty = new TicketsScreenUiState.Content(a06Var, z, withoutCTA, spaceLabelIfExists);
            jt1Var.B();
        } else if (a06Var.b().a instanceof ub6.a) {
            jt1Var.K(1279316105);
            ub6 ub6Var2 = a06Var.b().a;
            ub6Var2.getClass();
            if (((ub6.a) ub6Var2).b instanceof IOException) {
                Integer numValueOf = Integer.valueOf(R.string.intercom_failed_to_load_tickets);
                jt1Var.K(-374363926);
                boolean z3 = (((i & 14) ^ 6) > 4 && jt1Var.j(a06Var)) || (i & 6) == 4;
                Object objF3 = jt1Var.f();
                if (z3 || objF3 == c0187a) {
                    objF3 = new ca5(i3, a06Var);
                    jt1Var.C(objF3);
                }
                jt1Var.B();
                error = new TicketsScreenUiState.Error(new ErrorState.WithCTA(0, 0, numValueOf, 0, (mh4) objF3, 11, null), spaceLabelIfExists);
            } else {
                error = new TicketsScreenUiState.Error(new ErrorState.WithoutCTA(0, 0, Integer.valueOf(R.string.intercom_failed_to_load_tickets), 3, null), spaceLabelIfExists);
            }
            empty = error;
            jt1Var.B();
        } else if (a06Var.b().a instanceof ub6.b) {
            jt1Var.K(-374348650);
            jt1Var.B();
            empty = new TicketsScreenUiState.Initial(spaceLabelIfExists);
        } else {
            jt1Var.K(-374344942);
            empty = new TicketsScreenUiState.Empty(new EmptyState(nr1.f(jt1Var, R.string.intercom_tickets_empty_state_title), nr1.f(jt1Var, R.string.intercom_tickets_empty_state_text), null, 4, null), spaceLabelIfExists);
            jt1Var.B();
        }
        jt1Var.B();
        return empty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig reduceToTicketsScreenUiState$lambda$1$lambda$0() {
        return (AppConfig) z.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b reduceToTicketsScreenUiState$lambda$4$lambda$3$lambda$2(a06 a06Var) {
        a06Var.d();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b reduceToTicketsScreenUiState$lambda$6$lambda$5(a06 a06Var) {
        a06Var.c();
        return g2b.a;
    }
}
