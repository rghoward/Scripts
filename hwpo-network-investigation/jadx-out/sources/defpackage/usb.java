package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class usb implements el0 {
    public static final a Companion = new a();
    public final boolean a;
    public final yp4 b;
    public final yp4 c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public usb(boolean z, yp4 yp4Var, yp4 yp4Var2) {
        this.a = z;
        this.b = yp4Var;
        this.c = yp4Var2;
    }

    public static usb a(usb usbVar, boolean z, yp4 yp4Var, yp4 yp4Var2, int i) {
        if ((i & 1) != 0) {
            z = usbVar.a;
        }
        if ((i & 2) != 0) {
            yp4Var = usbVar.b;
        }
        if ((i & 4) != 0) {
            yp4Var2 = usbVar.c;
        }
        usbVar.getClass();
        return new usb(z, yp4Var, yp4Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usb)) {
            return false;
        }
        usb usbVar = (usb) obj;
        return this.a == usbVar.a && xj5.a(this.b, usbVar.b) && xj5.a(this.c, usbVar.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        yp4 yp4Var = this.b;
        int iHashCode2 = (iHashCode + (yp4Var == null ? 0 : yp4Var.hashCode())) * 31;
        yp4 yp4Var2 = this.c;
        return iHashCode2 + (yp4Var2 != null ? yp4Var2.hashCode() : 0);
    }

    public final String toString() {
        return "YourGymViewState(isProgress=" + this.a + ", initialGym=" + this.b + ", selectedGym=" + this.c + ")";
    }
}
