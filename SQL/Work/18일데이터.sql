select * from tb_bbs_board;

select @rnum := 0;

-- cross join
select @rnum:= @rnum+1 as r, a.boardcd
	from tb_bbs_board a, (select @rnum :=0) b
order by	boardcd desc;

-- 
delete from tb_bbs_board where boardcd in ('bc64','bc63');

-- 
select @rnum:= @rnum+1 as r, a.boardcd
	from tb_bbs_board a, (select @rnum :=0) b
order by	boardcd desc;

-- 
select boardcd, boardnm, UseYN
  from (
		select @rnum:= @rnum+1 as r, a.*
		from tb_bbs_board a
			, (select @rnum :=0) b
		order by	boardcd desc
	) t
where	r between 1 and 10
;
