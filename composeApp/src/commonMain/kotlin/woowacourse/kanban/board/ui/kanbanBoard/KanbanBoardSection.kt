package woowacourse.kanban.board.ui.kanbanBoard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
private fun KanbanBoardSectionPreview() {
    MaterialTheme{
        KanbanBoardSection()
    }
}

@Composable
fun KanbanBoardSection() {
    Row {
        Row {
            Column {
                Text("Compose Desktop 칸반 보드")
                Text("완료율 : 50% (3/6)")
            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(8.dp),
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "새 테스크 생성",
                    modifier = Modifier.size(20.dp)
                )
                Text("새 테스크 생성")
            }

        }

    }
}
