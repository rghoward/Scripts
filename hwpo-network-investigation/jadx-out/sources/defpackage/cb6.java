package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cb6 implements AccessibilityManager.AccessibilityStateChangeListener, yz9<Boolean> {
    public final boolean t;
    public final boolean u;
    public final dt7 v = bl7.i(Boolean.FALSE);
    public final b w;
    public final a x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements AccessibilityManager$AccessibilityServicesStateChangeListener {
        public final dt7 a;
        public final dt7 b;

        public a(cb6 cb6Var) {
            Boolean bool = Boolean.FALSE;
            this.a = bl7.i(bool);
            this.b = bl7.i(bool);
        }

        public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
            this.a.setValue(Boolean.valueOf(cb6.d(accessibilityManager)));
            this.b.setValue(Boolean.valueOf(cb6.e(accessibilityManager)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {
        public final dt7 t = bl7.i(Boolean.FALSE);

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z) {
            this.t.setValue(Boolean.valueOf(z));
        }
    }

    public cb6(boolean z, boolean z2, boolean z3) {
        this.t = z2;
        this.u = z3;
        a aVar = null;
        this.w = z ? new b() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            aVar = new a(this);
        }
        this.x = aVar;
    }

    public static boolean d(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && z2a.o(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && z2a.o(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public final void f(AccessibilityManager accessibilityManager) {
        a aVar;
        this.v.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
        accessibilityManager.addAccessibilityStateChangeListener(this);
        b bVar = this.w;
        if (bVar != null) {
            bVar.t.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
            accessibilityManager.addTouchExplorationStateChangeListener(bVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (aVar = this.x) == null) {
            return;
        }
        aVar.a.setValue(Boolean.valueOf(d(accessibilityManager)));
        aVar.b.setValue(Boolean.valueOf(e(accessibilityManager)));
        accessibilityManager.addAccessibilityServicesStateChangeListener(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yz9
    public final Boolean getValue() {
        boolean z;
        if (((Boolean) this.v.getValue()).booleanValue()) {
            z = true;
            b bVar = this.w;
            if (bVar == null || !((Boolean) bVar.t.getValue()).booleanValue()) {
                boolean z2 = this.t;
                a aVar = this.x;
                if ((!z2 || aVar == null || !((Boolean) aVar.a.getValue()).booleanValue()) && (!this.u || aVar == null || !((Boolean) aVar.b.getValue()).booleanValue())) {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void i(AccessibilityManager accessibilityManager) {
        a aVar;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        b bVar = this.w;
        if (bVar != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(bVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (aVar = this.x) == null) {
            return;
        }
        accessibilityManager.removeAccessibilityServicesStateChangeListener(aVar);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.v.setValue(Boolean.valueOf(z));
    }
}
