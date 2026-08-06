package defpackage;

import android.os.Bundle;
import com.hwpo_training_app.R;
import j$.time.LocalDate;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rh2 {
    /* JADX WARN: Code duplicated, block: B:25:0x009b A[PHI: r7
      0x009b: PHI (r7v8 by6) = (r7v7 by6), (r7v13 by6) binds: [B:29:0x00b0, B:24:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    public static gk6 a(int i, LocalDate localDate, LocalDate localDate2) {
        a21 a21VarA;
        by6 by6Var;
        localDate.getClass();
        zp9 zp9Var = new zp9();
        Long lValueOf = Long.valueOf(yk2.x(localDate));
        if (localDate2 != null) {
            a21.b bVar = new a21.b();
            ArrayList arrayList = new ArrayList();
            if (localDate2 != null) {
                LocalDate localDatePlusDays = localDate2.plusDays(1L);
                localDatePlusDays.getClass();
                arrayList.add(new zk2(yk2.x(localDatePlusDays)));
            }
            if (!arrayList.isEmpty()) {
                bVar.e = new qt1(arrayList, qt1.w);
            }
            a21VarA = bVar.a();
        } else {
            a21VarA = null;
        }
        if (a21VarA == null) {
            a21VarA = new a21.b().a();
        }
        by6 by6Var2 = a21VarA.u;
        by6 by6Var3 = a21VarA.t;
        if (i == 0) {
            i = R.string.mtrl_picker_date_header_title;
        }
        zp9Var.t = Long.valueOf(f6b.a(lValueOf.longValue()));
        if (a21VarA.w == null) {
            if (zp9Var.t().isEmpty()) {
                by6Var = new by6(f6b.d());
                if (by6Var.compareTo(by6Var3) >= 0) {
                    by6Var3 = by6Var;
                }
            } else {
                by6Var = by6.g(((Long) zp9Var.t().iterator().next()).longValue());
                if (by6Var.compareTo(by6Var3) < 0 || by6Var.compareTo(by6Var2) > 0) {
                    by6Var = new by6(f6b.d());
                    if (by6Var.compareTo(by6Var3) >= 0 && by6Var.compareTo(by6Var2) <= 0) {
                        by6Var3 = by6Var;
                    }
                } else {
                    by6Var3 = by6Var;
                }
            }
            a21VarA.w = by6Var3;
        }
        gk6 gk6Var = new gk6();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", R.style.Widget_HWPO_DatePicker);
        bundle.putParcelable("DATE_SELECTOR_KEY", zp9Var);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", a21VarA);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", i);
        bundle.putCharSequence("TITLE_TEXT_KEY", null);
        bundle.putInt("INPUT_MODE_KEY", 0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", 0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", null);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", 0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", null);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", 0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", null);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", 0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", null);
        gk6Var.setArguments(bundle);
        return gk6Var;
    }
}
