package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a67 {
    public final Context a;
    public final c57 b;
    public final Intent c;
    public final h67 d;
    public final ArrayList e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final Bundle b;

        public a(int i, Bundle bundle) {
            this.a = i;
            this.b = bundle;
        }
    }

    public a67(o67 o67Var) {
        Intent launchIntentForPackage;
        o67Var.getClass();
        Context context = o67Var.a;
        context.getClass();
        this.a = context;
        this.b = new c57(context);
        oz3.a aVar = new oz3.a(new oz3(new pva(ed9.d(context, new y57(0)), new z57(0)), false, new fd9()));
        Activity activity = (Activity) (!aVar.hasNext() ? null : aVar.next());
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.c = launchIntentForPackage;
        this.e = new ArrayList();
        this.d = o67Var.b.h();
    }

    public final baa a() {
        h67 h67Var = this.d;
        if (h67Var == null) {
            aa0.c("You must call setGraph() before constructing the deep link");
            return null;
        }
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            aa0.c("You must call setDestination() or addDestination() before constructing the deep link");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        c67 c67Var = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a aVar = (a) obj;
            int i2 = aVar.a;
            Bundle bundle = aVar.b;
            c67 c67VarB = b(i2);
            if (c67VarB == null) {
                int i3 = c67.x;
                f04.c("Navigation destination ", c67.a.a(this.b, i2), " cannot be found in the navigation graph ", h67Var);
                return null;
            }
            for (int i4 : c67VarB.e(c67Var)) {
                arrayList2.add(Integer.valueOf(i4));
                arrayList3.add(bundle);
            }
            c67Var = c67VarB;
        }
        int[] iArrS = th1.S(arrayList2);
        Intent intent = this.c;
        intent.putExtra("android-support-nav:controller:deepLinkIds", iArrS);
        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
        baa baaVar = new baa(this.a);
        Intent intent2 = new Intent(intent);
        ComponentName component = intent2.getComponent();
        if (component == null) {
            component = intent2.resolveActivity(baaVar.u.getPackageManager());
        }
        if (component != null) {
            baaVar.d(component);
        }
        ArrayList<Intent> arrayList4 = baaVar.t;
        arrayList4.add(intent2);
        int size2 = arrayList4.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Intent intent3 = arrayList4.get(i5);
            if (intent3 != null) {
                intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
            }
        }
        return baaVar;
    }

    public final c67 b(int i) {
        h30 h30Var = new h30();
        h67 h67Var = this.d;
        h67Var.getClass();
        h30Var.addLast(h67Var);
        while (!h30Var.isEmpty()) {
            c67 c67Var = (c67) h30Var.removeFirst();
            if (c67Var.u.d == i) {
                return c67Var;
            }
            if (c67Var instanceof h67) {
                Iterator<c67> it = ((h67) c67Var).iterator();
                while (true) {
                    k67 k67Var = (k67) it;
                    if (k67Var.hasNext()) {
                        h30Var.addLast((c67) k67Var.next());
                    }
                }
            }
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int i2 = ((a) obj).a;
            if (b(i2) == null) {
                int i3 = c67.x;
                sa1.a(aa.a("Navigation destination ", c67.a.a(this.b, i2), " cannot be found in the navigation graph "), this.d);
                return;
            }
        }
    }
}
