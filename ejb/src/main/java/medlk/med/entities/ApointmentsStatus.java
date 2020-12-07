package medlk.med.entities;

public enum ApointmentsStatus {

        NONE ("Приема на это время нет"),
        FREE ("Свободное время для записи"),
        REZERVED ("Время забронировано другим клиентом"),
        YOURS ("Забронированно за Вами");

        public String statusName;

        ApointmentsStatus(String statusName) {
            this.statusName = statusName;
        }


}
