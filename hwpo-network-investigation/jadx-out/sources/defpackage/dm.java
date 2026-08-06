package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dm extends m3 {
    public final /* synthetic */ cm t;
    public final /* synthetic */ qr5 u;
    public final /* synthetic */ cm v;

    public dm(cm cmVar, qr5 qr5Var, cm cmVar2) {
        this.t = cmVar;
        this.u = qr5Var;
        this.v = cmVar2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    @Override // defpackage.m3
    public final void onInitializeAccessibilityNodeInfo(View view, j4 j4Var) {
        super.onInitializeAccessibilityNodeInfo(view, j4Var);
        cm cmVar = this.t;
        lm lmVar = cmVar.S;
        if (lmVar.m()) {
            j4Var.a.setVisibleToUser(false);
        }
        qr5 qr5Var = this.u;
        qr5 qr5VarI = qr5Var.I();
        while (true) {
            if (qr5VarI == null) {
                qr5VarI = null;
                break;
            } else if (qr5VarI.Y.d(8)) {
                break;
            } else {
                qr5VarI = qr5VarI.I();
            }
        }
        Integer numValueOf = qr5VarI != null ? Integer.valueOf(qr5VarI.u) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == cmVar.getSemanticsOwner().a().f) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        j4Var.b = iIntValue;
        AccessibilityNodeInfo accessibilityNodeInfo = j4Var.a;
        cm cmVar2 = this.v;
        accessibilityNodeInfo.setParent(cmVar2, iIntValue);
        int i = qr5Var.u;
        int iD = lmVar.R.d(i);
        if (iD != -1) {
            bt btVarB = kc9.b(cmVar.getAndroidViewsHandler$ui(), iD);
            if (btVarB != null) {
                accessibilityNodeInfo.setTraversalBefore(btVarB);
            } else {
                accessibilityNodeInfo.setTraversalBefore(cmVar2, iD);
            }
            cm.L(cmVar, i, accessibilityNodeInfo, lmVar.T);
        }
        int iD2 = lmVar.S.d(i);
        if (iD2 != -1) {
            bt btVarB2 = kc9.b(cmVar.getAndroidViewsHandler$ui(), iD2);
            if (btVarB2 != null) {
                accessibilityNodeInfo.setTraversalAfter(btVarB2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(cmVar2, iD2);
            }
            cm.L(cmVar, i, accessibilityNodeInfo, lmVar.U);
        }
    }
}
