Переписать весь проект из предыдущего практического задания (AstServletRep) с использованием Hibernate (без Spring!!!!!!)
Заимплементить связь ManyToMany в Hibernate (а такая связь уже должна у вас быть в СУБД, если требования предыдущей практической задачи были выполнены. Если ее не оказалось - то добавьте.
Настроить каскадные связи между сущностями  с помощью Hibernate.
Расширить ваш существующий домен приложения. Теперь у вас будет 1 базовый абстрактный класс
От этого класса вы должны создать подклассы - наследники
Придумать и добавить каждому из подклассов уникальные поля, не обозначенные в суперклассе
Заимплементить иерархии наследования в БД на выбор (SINGLE_TABLE, JOINED, TABLE_PER_CLASS)
Сделать в коде полиморфные запросы ко всем классам-наследникам. 
Для Id использовать общий sequence в Postgres.  Убедиться, что идентификаторы идентичны среди всех возможных подтипов, базового абстрактного типа.
Воспроизвести в вашем коде проблему N+1 запроса в Hibernate
Решить в коде проблему N+1 запроса
Воспроизвести LazyInitializationException
Решите эту проблему
