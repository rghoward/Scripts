package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.ActionMode;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import j$.time.DayOfWeek;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qr implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ qr(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int color;
        String string;
        ColorStateList colorStateListValueOf;
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ActionMode actionMode = ((zr) obj2).h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return g2b.a;
            case 1:
                ya yaVar = (ya) obj2;
                ((List) obj).getClass();
                sq5 sq5Var = (sq5) yaVar.u;
                MaterialTextView materialTextView = sq5Var.b;
                MaterialTextView materialTextView2 = sq5Var.c;
                materialTextView.setText(String.valueOf(((zl2) yaVar.t()).a.getDayOfMonth()));
                MaterialTextView materialTextView3 = sq5Var.b;
                boolean z = ((zl2) yaVar.t()).c;
                boolean z2 = ((zl2) yaVar.t()).d;
                if (z) {
                    color = materialTextView3.getContext().getColor(R.color.labelQuinary);
                } else {
                    color = z2 ? materialTextView3.getContext().getColor(R.color.labelSuccess) : materialTextView3.getContext().getColor(R.color.labelPrimary);
                }
                materialTextView3.setTextColor(color);
                materialTextView3.setBackground(((zl2) yaVar.t()).c ? yaVar.w.getDrawable(R.drawable.bg_current_day) : null);
                Resources resources = sq5Var.a.getResources();
                resources.getClass();
                int value = ((zl2) yaVar.t()).a.getDayOfWeek().getValue() - 1;
                if (value == DayOfWeek.MONDAY.ordinal()) {
                    string = resources.getString(R.string.calendar_monday);
                } else if (value == DayOfWeek.TUESDAY.ordinal()) {
                    string = resources.getString(R.string.calendar_tuesday);
                } else if (value == DayOfWeek.WEDNESDAY.ordinal()) {
                    string = resources.getString(R.string.calendar_wednesday);
                } else if (value == DayOfWeek.THURSDAY.ordinal()) {
                    string = resources.getString(R.string.calendar_thursday);
                } else if (value == DayOfWeek.FRIDAY.ordinal()) {
                    string = resources.getString(R.string.calendar_friday);
                } else {
                    string = value == DayOfWeek.SATURDAY.ordinal() ? resources.getString(R.string.calendar_saturday) : resources.getString(R.string.calendar_sunday);
                }
                string.getClass();
                materialTextView2.setText(string);
                materialTextView2.setTextColor(((zl2) yaVar.t()).c ? materialTextView2.getContext().getColor(R.color.labelSuccess) : materialTextView2.getContext().getColor(R.color.labelSecondary));
                AppCompatImageView appCompatImageView = sq5Var.d;
                m21.a aVar = ((zl2) yaVar.t()).b;
                appCompatImageView.setVisibility(aVar == null ? 4 : 0);
                if (aVar != null) {
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 0) {
                        colorStateListValueOf = ColorStateList.valueOf(appCompatImageView.getContext().getColor(R.color.iconPrimaryDefault));
                    } else {
                        if (iOrdinal != 1) {
                            u.b();
                            return null;
                        }
                        colorStateListValueOf = ColorStateList.valueOf(appCompatImageView.getContext().getColor(R.color.iconPrimaryActive));
                    }
                    appCompatImageView.setImageTintList(colorStateListValueOf);
                }
                return g2b.a;
            case 2:
                ((mh4) obj2).invoke();
                return g2b.a;
            default:
                a58 a58Var = (a58) obj;
                ((lda) obj2).e(z69.j(a58Var, false));
                a58Var.a();
                return g2b.a;
        }
    }
}
