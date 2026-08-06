package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gib {
    public Interpolator c;
    public hib d;
    public boolean e;
    public long b = -1;
    public final a f = new a();
    public final ArrayList<fib> a = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends nq2 {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        @Override // defpackage.nq2, defpackage.hib
        public final void a() {
            if (this.a) {
                return;
            }
            this.a = true;
            hib hibVar = gib.this.d;
            if (hibVar != null) {
                hibVar.a();
            }
        }

        @Override // defpackage.hib
        public final void b() {
            int i = this.b + 1;
            this.b = i;
            gib gibVar = gib.this;
            if (i == gibVar.a.size()) {
                hib hibVar = gibVar.d;
                if (hibVar != null) {
                    hibVar.b();
                }
                this.b = 0;
                this.a = false;
                gibVar.e = false;
            }
        }
    }

    public final void a() {
        if (this.e) {
            ArrayList<fib> arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                fib fibVar = arrayList.get(i);
                i++;
                fibVar.b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        ArrayList<fib> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            fib fibVar = arrayList.get(i);
            i++;
            fib fibVar2 = fibVar;
            long j = this.b;
            if (j >= 0) {
                fibVar2.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = fibVar2.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                fibVar2.d(this.f);
            }
            View view2 = fibVar2.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
