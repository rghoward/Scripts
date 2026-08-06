package io.intercom.android.sdk.utilities;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.egb;
import defpackage.j4;
import defpackage.m3;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AccessibilityUtils {
    public static final int $stable = 0;
    public static final AccessibilityUtils INSTANCE = new AccessibilityUtils();

    private AccessibilityUtils() {
    }

    public final void addClickAbilityAnnouncement(View view) {
        view.getClass();
        egb.o(view, new m3() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils.addClickAbilityAnnouncement.1
            @Override // defpackage.m3
            public void onInitializeAccessibilityNodeInfo(View view2, j4 j4Var) {
                view2.getClass();
                j4Var.getClass();
                super.onInitializeAccessibilityNodeInfo(view2, j4Var);
                j4Var.b(j4.a.e);
                j4Var.a.setClickable(true);
            }
        });
    }

    public final void addHeadingAnnouncement(View view) {
        view.getClass();
        egb.o(view, new m3() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils.addHeadingAnnouncement.1
            @Override // defpackage.m3
            public void onInitializeAccessibilityNodeInfo(View view2, j4 j4Var) {
                view2.getClass();
                j4Var.getClass();
                super.onInitializeAccessibilityNodeInfo(view2, j4Var);
                j4Var.m(true);
            }
        });
    }

    public final void removeClickAbilityAnnouncement(View view) {
        view.getClass();
        egb.o(view, new m3() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils.removeClickAbilityAnnouncement.1
            @Override // defpackage.m3
            public void onInitializeAccessibilityNodeInfo(View view2, j4 j4Var) {
                view2.getClass();
                j4Var.getClass();
                super.onInitializeAccessibilityNodeInfo(view2, j4Var);
                j4.a aVar = j4.a.e;
                AccessibilityNodeInfo accessibilityNodeInfo = j4Var.a;
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) j4.a.f.a);
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.setLongClickable(false);
            }
        });
    }
}
