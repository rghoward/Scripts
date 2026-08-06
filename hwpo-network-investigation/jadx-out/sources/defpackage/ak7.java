package defpackage;

import android.text.SpannedString;
import androidx.fragment.app.f;
import androidx.fragment.app.l;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ak7 extends xf4 {
    public final List<a> m;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final SpannedString b;
        public final int c;

        public a(int i, SpannedString spannedString, int i2) {
            this.a = i;
            this.b = spannedString;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Slide(drawable=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append((Object) this.b);
            sb.append(", description=");
            return i34.b(this.c, ")", sb);
        }
    }

    public ak7(List<a> list, l lVar, s66 s66Var) {
        super(lVar, s66Var);
        this.m = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int f() {
        return this.m.size();
    }

    @Override // defpackage.xf4
    public final f w(int i) {
        List<a> list = this.m;
        if (i >= list.size()) {
            throw new RuntimeException(i + " is incorrect position");
        }
        tr9.a aVar = tr9.Companion;
        int i2 = list.get(i).a;
        SpannedString spannedString = list.get(i).b;
        int i3 = list.get(i).c;
        aVar.getClass();
        tr9 tr9Var = new tr9();
        tr9Var.setArguments(uy0.c(new js7("com.getsjitdone.james.ui.onboarding.slides.DRAWABLE_ARG", Integer.valueOf(i2)), new js7("com.getsjitdone.james.ui.onboarding.slides.TITLE_ARG", spannedString), new js7("com.getsjitdone.james.ui.onboarding.slides.SUBTITLE_ARG", Integer.valueOf(i3))));
        return tr9Var;
    }
}
